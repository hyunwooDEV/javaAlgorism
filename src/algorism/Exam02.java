package algorism;

public class Exam02 {
	
	public static void main(String[] args) {
		
		
		int [] arr = new int [100];
		
		// An = An-1 + An-2;
		
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i =3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			
		}
		
		for (int i=1; i<10; i++) {
			System.out.println(arr[i]);
		}
		

		//배열을 쓰지말고 구해보자.
		//An
		
		int prevPrevNum = 1; //An-2
		int prevNum = 1;	//An-1
		
		System.out.println(prevPrevNum + "");
		System.out.println(prevNum + "");
		
		for (int i=3; i<=10; i++) {
			int nNum = prevPrevNum + prevNum;
			System.out.println(nNum);
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
		
		
		
		
	}
	
	
	
	
}

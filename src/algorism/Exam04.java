package algorism;

public class Exam04 {
	
	public static void main(String[] args) {
		
		
		//10������ 2������ ����
		
		// 10����:19
		
		// 2����:10011
		
		int [] answer = new int [5];
		
		int num = 19;
		int i = 0;

		while (num > 0) {
			answer[i] = num % 2;
			num = num / 2;
			i++;
		}
		
		
		for (i=0; i<5; i++) {
		System.out.println(answer[i]);
		}
		
		
	}
}

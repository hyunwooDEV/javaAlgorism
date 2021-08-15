package algorism;

public class Exam04 {
	
	public static void main(String[] args) {
		
		
		//10진수를 2진수로 변경
		
		// 10진수:19
		
		// 2진수:10011
		
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

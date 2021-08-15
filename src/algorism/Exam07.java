package algorism;

import java.util.Scanner;

public class Exam07 {
	
	public static void main(String[] args) {
		//소수 인지 아닌지 구분하기
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		
		for (int i=1; i<num; i++) {
			System.out.println(sum);
			if(num % i == 0) {
				sum++;
				System.out.println(sum);
			}
			
		}
		
		
		if (sum == 1) {
			System.out.println(num + " 은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다");
			
		}
		
		
		
	}

}

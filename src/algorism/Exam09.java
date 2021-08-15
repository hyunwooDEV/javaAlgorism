package algorism;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam09 {
	
	public static void main(String[] args) {
		//각자릿수 더하기
		
		System.out.println("숫자 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
	}

}

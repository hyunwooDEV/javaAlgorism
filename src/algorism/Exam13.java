package algorism;

import java.util.Scanner;

public class Exam13 {
	
	public static void main(String[] args) {
		
		// n을 입력 받아 *을 출력하시오
		
		/*
		 
		 *
		 **
		 ***
		 ****
		  
		 * */
		
		System.out.println("별 개수:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		

		
		for (int i=1; i<=num; i++) {
			
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		
		
		
		
		
	}

}

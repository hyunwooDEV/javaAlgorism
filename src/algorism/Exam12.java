package algorism;

import java.util.Scanner;

public class Exam12 {
	
	public static void main(String[] args) {
		
		System.out.println("���۴�:");
		Scanner scan = new Scanner(System.in);
		int startDan = scan.nextInt();
		
		System.out.println("����:");
		Scanner scan2 = new Scanner(System.in);
		int endDan = scan2.nextInt();
		
		
		for (int i = 1; i<=9; i++) {
			for (int j=startDan; j<=endDan; j++) {
				System.out.printf(" %d * %d = %d ", j, i, j * i);
			}
			System.out.println();
		}
	
		
	}

}

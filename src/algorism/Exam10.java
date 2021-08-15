package algorism;

import java.util.Arrays;
import java.util.Scanner;



public class Exam10 {
	
	public static void main(String[] args) {
		
		//입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력
		
		System.out.println("숫자 입력:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int start = 1;
		int rule = 1;
		
		int [][] list = new int [num][num];
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {
				list [i][j] = rule++;

			} 
		}
		
		
		for (int i=0; i<list.length; i++) {
			System.out.println(Arrays.toString(list[i]));
		}
		
		
		
		
	}

}

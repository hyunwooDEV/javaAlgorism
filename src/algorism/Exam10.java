package algorism;

import java.util.Arrays;
import java.util.Scanner;



public class Exam10 {
	
	public static void main(String[] args) {
		
		//�Էµ� ��(N) ��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ���
		
		System.out.println("���� �Է�:");
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

package algorism;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam08 {
	
	public static void main(String[] args) {
		
		//�Էµ� ���� ���丮�� ���ϱ�
		System.out.println("���丮��: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int answer = 1;

		
		
		for (int i = num; i>=1; i--) {
			
			answer = answer * i;
			
		}
		
		System.out.println(answer);
		
		
	
		
	}

}

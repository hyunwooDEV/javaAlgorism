package algorism;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam09 {
	
	public static void main(String[] args) {
		//���ڸ��� ���ϱ�
		
		System.out.println("���� �Է�");
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

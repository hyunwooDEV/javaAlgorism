package algorism;

import java.util.Scanner;

public class Exam07 {
	
	public static void main(String[] args) {
		//�Ҽ� ���� �ƴ��� �����ϱ�
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
			System.out.println(num + " �� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
			
		}
		
		
		
	}

}

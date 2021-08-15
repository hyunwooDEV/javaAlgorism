package algorism;

import java.util.Arrays;
import java.util.Scanner;



public class Exam03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] input = new int[10];
		for(int i=0; i<10; i++) {
			input[i] = scan.nextInt();		
		}
		
		//����� input 
		
		//1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4
		// 3: 2
		// 4: 2
		
		int [] mode = new int[10];
		
		//index -> ������ ��
		//index �� -> index(�����Ѽ�)�� ��� ���Դ��� �����ϴ� �뵵
		
		//"mode[3] = 5, => 3�����ڰ�, 5�� �����ߴ�"
		//1 2 2 3 1 4 2 2 4 3
		for (int i=0; i<10; i++) {
			mode[input[i]]++; //mode[2] == 4
			
		}
		//mode[1] == 2
		//mode[2] == 4
		//mode[3] == 2
		// i�� �Է��Ѽ��ڰ�, ������� Ƚ����.
		
		int inputNum = 0;
		int cntNum = 0;
		
		
		for (int i=0; i<10; i++) {
			if(cntNum < mode[i]) {
				cntNum = mode[i];
				inputNum = i;
			}
			
		}
		
		System.out.println("�ֺ����" + inputNum + "Ƚ����" + cntNum);
	
	}
	
}

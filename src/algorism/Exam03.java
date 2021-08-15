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
		
		//사용자 input 
		
		//1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4
		// 3: 2
		// 4: 2
		
		int [] mode = new int[10];
		
		//index -> 출현한 수
		//index 값 -> index(출현한수)가 몇번 나왔는지 저장하는 용도
		
		//"mode[3] = 5, => 3번숫자가, 5번 출현했다"
		//1 2 2 3 1 4 2 2 4 3
		for (int i=0; i<10; i++) {
			mode[input[i]]++; //mode[2] == 4
			
		}
		//mode[1] == 2
		//mode[2] == 4
		//mode[3] == 2
		// i는 입력한숫자고, 결과값은 횟수다.
		
		int inputNum = 0;
		int cntNum = 0;
		
		
		for (int i=0; i<10; i++) {
			if(cntNum < mode[i]) {
				cntNum = mode[i];
				inputNum = i;
			}
			
		}
		
		System.out.println("최빈수는" + inputNum + "횟수는" + cntNum);
	
	}
	
}

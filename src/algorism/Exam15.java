package algorism;

public class Exam15 {
	
	public static void main(String[] args) {
		
		// ���� �Է� n�� m���� ����� ����Ͻÿ�
		// �Է� 5 3
		// ���� 125
		
		int n = 5;
		int m = 3;
		int answer = 1;
		
		for (int i=1; i<=m; i++) {
			answer *= n;
		}
		
		System.out.println(answer);
		
		
		
	}

}

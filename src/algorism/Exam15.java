package algorism;

public class Exam15 {
	
	public static void main(String[] args) {
		
		// 다음 입력 n의 m승의 결과를 출력하시오
		// 입력 5 3
		// 정답 125
		
		int n = 5;
		int m = 3;
		int answer = 1;
		
		for (int i=1; i<=m; i++) {
			answer *= n;
		}
		
		System.out.println(answer);
		
		
		
	}

}

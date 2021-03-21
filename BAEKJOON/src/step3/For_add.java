package step3;

import java.util.Scanner;

public class For_add {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int[] sum = new int[5];
		int COUNT_CASE = sc.nextInt();
		
		for(int i=0; i<COUNT_CASE; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum[i] = a + b;
		}
		
		for(int j=0; j<COUNT_CASE; j++) {
			System.out.println(sum[j]);
		}
				
	}

}

// 문제 번호 : 10950 
// 메모리 : 
// 시간 :

// 첫 번째 시도 : ArrayIndexOutOfBounds 컴파일 에러 발생.
// 원인 : Eclipse에서 컴파일하면 문제없이 잘 실행되는데 
//        백준에서 채점 할 때 ArrayIndexOutOfBounds 오류가 발생한다. 
// 해결 : 실패 


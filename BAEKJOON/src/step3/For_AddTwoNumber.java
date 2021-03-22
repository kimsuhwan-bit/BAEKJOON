package step3;

import java.util.Scanner;

public class For_AddTwoNumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int COUNT_CASE = sc.nextInt();
		int[] sum = new int[COUNT_CASE];
		
		for(int i=0; i<COUNT_CASE; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum[i] = a + b;
		}
		sc.close();
		
		for(int j : sum) {
			System.out.println(j);
		}
	}

}

// 2021-03-21 첫 번째 시도 : ArrayIndexOutOfBounds 컴파일 에러 발생.
// 원인 : Eclipse에서 컴파일하면 문제없이 잘 실행되는데 
//        백준에서 채점 할 때 ArrayIndexOutOfBounds 오류가 발생한다. 

// 2021-03-22 두 번째 시도 : 성공
// 해결 방법 : 첫 시도에는 sum배열을 new int[5]로 만들었는데 두 번째 시도엔 입력받은 테스트 개수를 바로 넣어주었다.
// 후기 : 첫 번째 시도에서 왜 ArrayIndexOutOfBounds가 발생했는지 궁금하다. 조금 더 알아봐야겠다 

// 문제 번호 : 10950 
// 메모리 : 18356KB 
// 시간 : 244ms
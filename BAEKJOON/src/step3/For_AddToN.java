package step3;

import java.util.Scanner;

public class For_AddToN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=number; i++) {
			sum += i;
		}
		sc.close();

		System.out.println(sum);
	}

}

// 문제 번호 : 8393
// 메모리 : 18224KB
// 시간 : 240ms

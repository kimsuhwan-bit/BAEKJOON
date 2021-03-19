package step2;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}

// 문제 번호 : 2753
// 메모리 : 18396KB
// 시간 : 240ms

// 3번째 풀어보는 윤년 문제였다. 윤년의 조건을 정확히 파악하는 것이 중요한 문제!
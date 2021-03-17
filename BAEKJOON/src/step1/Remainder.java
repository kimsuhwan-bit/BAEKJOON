package step1;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
		
		
	}

}

// 문제번호 : 10430
// 메모리 : 18336KB
// 시간 : 244ms
package step3;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

}

// 문제 번호 : 2739
// 메모리 : 19844KB 
// 시간 : 276ms

// 코딩을 시작하고 꽤 많이 해본 기본적인 구구단 문제였다!
// for문의 반복 횟수가 많아서 그런지 생각보다 메모리가 많이 사용된 것 같다.
// if문 3개의 메모리 용량보다 더 크다. 
// for문이 메모리를 많이 사용한다는 것을 알게 되었다.

package step2;

import java.util.Scanner;

public class Compare_two_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}

}

// 문제 번호 : 1330
// 메모리 : 18244KB
// 시간 : 232ms
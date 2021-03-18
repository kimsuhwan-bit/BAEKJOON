package step1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		String b = sc.next();
		
		System.out.println(a * (b.charAt(2) - '0'));	
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a * (b.charAt(0) - '0'));
		System.out.println(a * Integer.parseInt(b));

		sc.close();
	}
}

// System.out.println(a * (b.charAt(2) - '0'));	-> charAt()으로 값을 가져올 때 ASCII코드값으로 변환되는 것을 막기 위해 - '0'을 붙인다.
// System.out.println(a * Integer.parseInt(b));	-> 연산을 위해 String인 b를 int로 변환한다.

// 문제 번호 : 2588번
// 메모리 : 18244KB
// 시간 : 224ms

// 처음 문제를 푸려고 시도했을땐 배열로 처리해보려고 하다가 막혔었다..
// 조금 더 단순하게 접근해보자 생각하니 의외로 쉽게 해결되었다!
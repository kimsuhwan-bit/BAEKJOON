package step2;

import java.util.Scanner;

public class Alarm_clock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if((hour>= 0 && hour <= 23) && (minute >= 0 && minute <= 59)) {
			if((hour == 0) && (minute < 45)) {
				hour = 23;
				minute += 15;
				System.out.print(hour + " ");
				System.out.print(minute);
			} else {
				if(minute < 45) {
					hour -= 1;
					minute += 15;
					System.out.print(hour + " ");
					System.out.print(minute);
				} else {
					minute -= 45;
					System.out.print(hour + " ");
					System.out.print(minute);
				}
			}
		}
		
	}

}

// 문제 번호 : 2884 
// 메모리 : 19552KB
// 시간 : 248ms

// if문을 참 좋아하는데 첫 시도에 바로 정답을 맞춰서 매우 기뻤다!
// 문제 속 조건을 알아내 로직을 구현해 성공했을 때 느끼는 성취감과 기쁨이 너무 좋다!! ㅎㅎ
// if문을 3개나 사용해서 그런지 이제껏 풀었던 문제들보다 메모리가 약간 더 크다.
// 기본적으로 구동했을 때 사용되는 메모리는 18000KB(18MB) 언저리 쯤 되는 것 같다.
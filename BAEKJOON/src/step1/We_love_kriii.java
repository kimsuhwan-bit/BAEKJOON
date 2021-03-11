package step1;

public class We_love_kriii {

	public static void main(String[] args) {

		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
	}

}

// 단순 출력을 요구하는 문제.
// System.out.println(); 으로 원하는 문구를 출력시킬 수 있다.

// System.out.println();으로 출력하는 것과 for문을 2번 돌려서 실행시키는 것 중 어떤 것이 더 효율적일까?

// System.out.print("강한친구 대한육군");
// System.out.print("강한친구 대한육군");
// 메모리 - 14076KB		처리시간 : 116ms	코드길이 : 172B

// for(int i=0; i<2; i++) {
//	 System.out.println("강한친구 대한육군");
// }
// 메모리 - 14296KB		처리시간 : 120ms	코드길이 : 155B

// for문으로 처리한 것이 코드길이는 더 짧음에도 처리시간이 약간 더 오래걸리고 메모리도 조금 더 차지한다!
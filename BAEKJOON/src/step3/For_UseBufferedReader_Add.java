package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class For_UseBufferedReader_Add {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(a+b + "\n"));
		}
		
		bw.flush();
		bw.close();
	}

}

// 문제 번호 : 15552
// 메모리 : 237836KB (232.26MB)
// 시간 : 904ms (0.9s)

// 2021-03-22 : 실패
// 리뷰 : 자바를 배우면서 1번 정도 밖에 사용해보지 않았던 BufferedReader를 사용하는 것이 어려워서
//        결국 다른 분들의 코드를 보며 공부했다.
//        .flush() : 출력 버퍼에 임시로 보관되어 출력 대기중인 데이터를 내보내는 것!!

//        BufferedWriter 클래스는 버퍼가 가득 차거나 스트림이 정상적으로 종료될 때 
//        자동으로 flush() 메소드를 호출한다!

//		  StringTokenizer 클래스를 공부하고 도전해야겠다..!

// 2021-03-25 : 성공
// 리뷰 : BufferedWriter에 숫자를 넣고 출력하면 제대로 출력되지 않는 것을 확인했다!
//        그래서 숫자를 int로 출력하는 것이 아니라 String으로 변환해 출력하니 정상적으로 출력되었다!
//        형변환이 조금 번거롭긴하지만 처리속도가 훨씬 빠르니 익숙해진다면 아주 유용할 것 같다!
//        BufferedReader는 readLine() 메소드를 사용해 String으로 입력받는다.
//        문제에선 공백을 포함한 입력을 받게끔해서 String으로 시도하다 많이 실패했다. 
//        하지만 StringTokenizer 클래스를 API와 다른 분들의 도움을 받아 공부하고 StringTokenizer의 생성자에 String이
//        올 수 있다는 것과 nextToken() 메소드를 사용해 공백을 포함한 입력을 받을 시 공백을 제외하고 
// 		  그 자리에 문자열을 당겨서 처리한다는 것을 알게 되었다.
//		  입출력의 기본이 되는 BufferedReader와 BufferedWriter를 공부하고 사용해볼 수 있는 아주 유익한 문제였다!
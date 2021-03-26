package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_add_B_minus_7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

// 문제 번호 : 11021
// 메모리 : 16700KB
// 시간 : 156ms

// 리뷰 : 처음 BufferedReader와 BufferdWriter, Stringtokenizer을 공부했던 문제와 아~주 비슷한 문제였다.
//		  복습 및 적용차원에서 아주 좋은 연습문제였던 것 같다! 
//		  이 문제를 통해 다시 한번 정리할 수 있었고, 쓸 수 있는 클래스가 많아져서 너~무 재밌다.

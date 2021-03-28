package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_add_B_minus_8 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = A + B;
			bw.write("Case #" + i + ": " + A + " " + "+" + " " + B + " " + "=" + " " + C + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

// 문제 번호 : 11022
// 메모리 : 17004KB 
// 시간 : 200ms

// 리뷰 : BufferedReader와 BufferedWriter, Stringtokenizer을 연습할 수 있는 3번째 문제였다!
//        여러 번 사용을 연습해서 많이 익숙해졌다! 
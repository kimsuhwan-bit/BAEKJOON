package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Print_N_to_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			bw.write(String.valueOf(N - i) + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}

// 문제 번호 : 2742
// 메모리 : 26128KB
// 시간 : 300ms

// 리뷰 : 메모리와 시간이 생각보다 크게 나와서 import java.io.*로 해서그런가? 생각이 들어서
//		  필요한 클래스만 import를 해보았더니 26044KB / 288ms의 결과가 나왔다.
//		  지금 내가 보기엔 아주 미세한 성능의 차이인듯하지만 나중엔 중요한 부분일 수도 있겠다.
//		  성능을 위해 java.?.*의 사용을 자제하자. 
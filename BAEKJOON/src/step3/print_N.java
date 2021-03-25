package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class print_N {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		if( N > 100000 ) return;
		
		for(int i=1; i<=N; i++) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}

// 문제 번호 : 2741
// 메모리 : 21872KB
// 시간 : 292ms

// 리뷰 : 지난 번 문제에서 BufferedReader와 BufferedWriter를 공부하고 처음 적용해본 문제이다!
//      : 공부한 것을 간단하게나마 적용할 수 있어서 너~무 기분 좋은 문제였다!
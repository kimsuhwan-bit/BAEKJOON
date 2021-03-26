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
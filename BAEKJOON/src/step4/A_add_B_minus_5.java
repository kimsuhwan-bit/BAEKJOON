package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A_add_B_minus_5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum;
		
		while (true) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if (A == 0 && B == 0) {
				break;
			}
			
			sum = A + B;
			bw.write(String.valueOf(sum) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}

// 문제 번호 : 10952
// 메모리 : 14568KB
// 시간 : 132ms

// 리뷰 : 앞서 for문으로 처리했던 문제를 while로 처리하는 방식으로 바뀐 문제이다!
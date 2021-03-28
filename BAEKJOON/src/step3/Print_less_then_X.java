package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Print_less_then_X {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer N_X = new StringTokenizer(br.readLine());
		
		int Sequence_size = Integer.parseInt(N_X.nextToken());
		
		int[] N = new int[Sequence_size];
		
		int X = Integer.parseInt(N_X.nextToken());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<Sequence_size; i++) {
			N[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<Sequence_size; j++) {
			if(N[j] < X) {
				bw.write(String.valueOf(N[j]) + " ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

// 문제 번호 : 10871번
// 메모리 : 16772KB
// 시간 : 232ms

// 리뷰 : StringTokenizer을 사용해 공백을 포함한 입력을 받고, 출력하는 것에
//        많이 익숙해진 것을 느낀 문제였다!

// 검토 코드
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//StringTokenizer N_X = new StringTokenizer(br.readLine());
//int Sequence_size = Integer.parseInt(N_X.nextToken());
//bw.write("Sequence_size : " + Sequence_size + "\n");
//int[] N = new int[Sequence_size];
//bw.write("N size : " + N.length + "\n");
//int X = Integer.parseInt(N_X.nextToken());
//bw.write("X size : " + X + "\n");
//StringTokenizer st = new StringTokenizer(br.readLine());
//for(int i=0; i<Sequence_size; i++) {
//	N[i] = Integer.parseInt(st.nextToken());
//}
//for(int j=0; j<Sequence_size; j++) {
//	if(N[j] < X) {
//		bw.write(String.valueOf(N[j]) + " ");
//	}
//}
//bw.write("\n");
//for(int k=0; k<Sequence_size; k++) {
//	bw.write(String.valueOf(N[k]) + "\n");
//}
//bw.write("End");
//br.close();
//bw.flush();
//bw.close();

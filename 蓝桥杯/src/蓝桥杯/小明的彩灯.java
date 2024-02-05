package 蓝桥杯;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 小明的彩灯 {
	public static int N;
	public static int Q;
	public static long[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//		// 将连字符加入到可以作为单词一部分的字符集中
//		in.wordChars('-', '-');
//		// 指示解析所有的数字
//		in.parseNumbers();
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			// 第一行
			N = (int) in.nval;
			in.nextToken();
			Q = (int) in.nval;
			arr = new long[N + 2];
			for (int i = 1; i <= N; i++) {
				in.nextToken();
				arr[i] = (int) in.nval;
			}
			for (int i = 0; i < Q; i++) {
				in.nextToken();
				int start = (int) in.nval;
				in.nextToken();
				int end = (int) in.nval;
				in.nextToken();
				long addNum = (long) in.nval;
				for (int j = start; j <= end; j++) {
					arr[j] += addNum;
				}
			}
			for (int i = 1; i <= N; i++) {
				if (arr[i] < 0) {
					out.print(0 + " ");
				} else {
					out.print(arr[i] + " ");
				}
			}
		}

		out.flush();
		out.close();
		br.close();
	}

}

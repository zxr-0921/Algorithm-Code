package 蓝桥杯;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 矩阵消消乐 {
	public static int N;
	public static int[][] arr;
	public static int[] cnt;
	public static int[] bnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			N = (int) in.nval;
			arr = new int[N][N];
			cnt = new int[N];
			bnt = new int[N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					in.nextToken();
					arr[i][j] = (int) in.nval;
					if (verify(arr[i][j])) {
						cnt[i] = 1;
						bnt[j] = 1;
					}
				}
			}
			// 对所在行和所在列进行全部改为1
			for (int i = 0; i < N; i++) {
				if (cnt[i] == 1) {
					for (int j = 0; j < N; j++) {
						arr[i][j] = 1;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				if (bnt[i] == 1) {
					for (int j = 0; j < N; j++) {
						arr[j][i] = 1;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					out.print(arr[i][j] + " ");
//					System.out.print(arr[i][j] + " ");
				}
				out.println();
//				System.out.println();

			}
		}

		out.flush();
		br.close();
		out.close();
	}

	public static boolean verify(int n) {
		if (n <= 0) {
			return false;
		}
		return (n & (n - 1)) == 0;

	}

}

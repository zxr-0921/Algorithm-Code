package 洛谷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;

public class 彩票摇奖 {
	public static int[] win = new int[8];
	public static int[] mer = new int[8];
	public static int n = 0;
	public static int m = 0;

	public static void main(String[] args) throws IOException {
		int[] win = new int[8];
		int[] mer = new int[8];
		int n = 0;
		int m = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> s = new HashSet<Integer>();
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			for (int i = 0; i < 7; i++) {
				in.nextToken();
				s.add((int) in.nval);
			}
			while (n > 0) {
				for (int i = 0; i < 7; i++) {
					in.nextToken();
					if (s.contains((int) in.nval)) {
						m++;
					}
				}
				mer[m]++;
				m = 0;
				n--;
			}

			for (int i = 7; i >= 1; i--) {
				out.print(mer[i] + " ");
//				System.out.print(mer[i] + " ");
			}

		}
		out.close();
		br.close();

	}

}

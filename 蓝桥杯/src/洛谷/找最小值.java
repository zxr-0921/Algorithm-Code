package 洛谷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 找最小值 {
	public static int n;
	public static int[] a;
	public static int MAX = 1001;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			a = new int[n];
			for (int i = 0; i < n; i++) {
				in.nextToken();
				a[i] = (int) in.nval;
			}
			for (int i = 0; i < n; i++) {
				MAX = a[i] < MAX ? a[i] : MAX;
			}
			out.print(MAX);
		}
		br.close();
		out.close();
	}

}

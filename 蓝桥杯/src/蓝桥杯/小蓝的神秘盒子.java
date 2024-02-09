package 蓝桥杯;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 小蓝的神秘盒子 {
	public static int n;
	public static int MAXINT = 100001;
	public static int[] st = new int[MAXINT];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int r = 0;
		int a;
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			for (int i = 0; i < n; i++) {
				in.nextToken();
				a = (int) in.nval;
				if ( a== 0) {
					if(r==0) {
						continue;
					}
					r--;
					continue;
				}
				
				st[r++]=a;
			}
			r-=1;
			while (r >= 0) {
				out.println(st[r--]);
//				System.out.println(st[r--]);
			}
		}
		out.flush();
		br.close();
		out.close();
	}

}

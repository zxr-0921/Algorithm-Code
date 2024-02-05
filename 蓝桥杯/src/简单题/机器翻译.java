package 简单题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 机器翻译 {
	public static int M;
	public static int N;
	public static int[] a;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(br);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		try {
			while (in.nextToken() != StreamTokenizer.TT_EOF) {
				M = (int) in.nval;
				in.nextToken();
				N = (int) in.nval;
				a = new int[N];
				for (int i = 0; i < N; i++) {
					in.nextToken();
					a[i] = (int) in.nval;
				}
				out.print(tranTech(M, N, a));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	public static int tranTech(int m, int n, int[] arr) {
		Queue<Integer> q = new LinkedList<Integer>();
		int full = 3;
		int w = 0;
		// 从数组中读入到队列
		// 1.判断队列中是否有缓存
		for (int i = 0; i < arr.length; i++) {
			// 2.没有则加入
			if (!q.contains(arr[i])) {
				// 如果队列没满
				if (full != 0) {
					q.add(arr[i]);
					w++;
					full--;
					// 队列满了
				} else {
					q.poll();
					q.add(arr[i]);
					w++;

				}
			}
		}

		return w;

	}

}

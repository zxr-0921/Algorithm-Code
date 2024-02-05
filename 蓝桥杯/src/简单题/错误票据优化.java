package 简单题;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 错误票据优化 {
	public static int n;
	public static String[] parts;
	public static String line;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			n = br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < n; i++) {
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			parts = line.split(" ");
			for (int j = 0; j < parts.length; j++) {
				list.add(Integer.parseInt(parts[j]));
			}
		}
//		排序
		Collections.sort(list);

		int a = 0, b = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) - list.get(i - 1) == 2)
				a = list.get(i) - 1;
			// 不能直接用==，因为获取出来的是对象
			if (list.get(i).equals(list.get(i - 1)))
				b = list.get(i);
		}
		out.print(a + " " + b);
		out.flush();

		out.close();

	}

}

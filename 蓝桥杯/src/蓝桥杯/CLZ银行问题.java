package 蓝桥杯;

import java.util.Scanner;

public class CLZ银行问题 {
	public static String[] queue1;
	public static String[] queue2;
	public static String[] str;
	public static String s;

	public static int M;

	public static void main(String[] args) {
		int l = 0, r = 0, p = 0, q = 0;

		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		sc.nextLine();
		queue1 = new String[M];
		queue2 = new String[M];
		for (int i = 0; i < M; i++) {
			s = sc.nextLine();
			str = s.split(" ");
			if (str[0].equals("IN")) {
				if (str[2].equals("V")) {
					queue1[r++] = str[1];
				} else {
					queue2[q++] = str[1];
				}
			} else {
				if (str[1].equals("V")) {
					l++;
				} else {
					p++;
				}
			}

		}
		for (int i = l; i <= r-1; i++) {
			System.out.println(queue1[i]);
		}

		for (int i = p; i <= q-1; i++) {
			System.out.println(queue2[i]);
		}

		sc.close();

	}

}

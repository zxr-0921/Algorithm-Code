package 洛谷;

import java.util.Scanner;

public class 分类平均 {

	public static void main(String[] args) {
		int n = 0, k = 0;
		double a = 0, b = 0;
		int m = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % k == 0) {
				a += i;
				m++;
			} else {
				b += i;
			}
		}
		a = a / m;
		b = b / (n - m);
		String A = String.format("%.1f", a);
		String B = String.format("%.1f", b);
		System.out.print(A + " " + B);

		sc.close();
	}

}

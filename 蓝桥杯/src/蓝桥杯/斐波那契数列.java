package 蓝桥杯;

import java.util.Scanner;

public class 斐波那契数列 {
	public static int T;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		arr = new int[T];
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			arr[i] = fib(n);
		}
		for (int a : arr) {
			System.out.println(a);
		}
		sc.close();
	}

	public static int fib(int n) {
		final int MOD = 1000000007;
		if (n < 2) {
			return n;
		}
		int lastLast = 0, last = 1;
		for (int i = 2, cur; i <= n; i++) {
			cur = (lastLast + last) % MOD;
			lastLast = last;
			last = cur;
		}
		return last;
	}
}

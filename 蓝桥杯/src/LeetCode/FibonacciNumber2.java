package LeetCode;

import java.util.Arrays;

//斐波那契数列

public class FibonacciNumber2 {

	public int fib(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return f1(n, dp);

	}

	public static int f1(int num, int[] dp) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		// 使用缓存表
		// 如果缓存表里面有
		if (dp[num] != -1) {
			return dp[num];
		}
		// 没有，则递归
		int ans = f1(num - 1, dp) + f1(num - 2, dp);
		// 计算出来后，存入缓存表
		dp[num] = ans;
		return dp[num];
	}

}

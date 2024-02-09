package LeetCode;

//斐波那契数列
public class FibonacciNumber3 {

	public int fib(int n) {
		return f1(n);

	}

	// 思路：定义一个数组，正向计算斐波那契数列
	public static int f1(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		int[] dp = new int[num + 1];
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[num];
	}

}

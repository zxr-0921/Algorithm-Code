package LeetCode;

//斐波那契数列
public class FibonacciNumber4 {

	public int fib(int n) {
		return f1(n);

	}

	public static int f1(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		// 定义两个变量，滚动记录
		int lastLast = 0, last = 1;
		for (int i = 2, cur; i <= num; i++) {
			cur = lastLast + last;
			lastLast = last;
			last = cur;
		}
		return last;
	}

}

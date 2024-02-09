package LeetCode;
//斐波那契数列
public class FibonacciNumber {

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
		return f1(num - 1) + f1(num - 2);
	}

}

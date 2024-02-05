package 蓝桥杯;

public class 阶乘求和 {
	static int MOD = 1000000000;

	// 思路：每一个数当前有多少个5因子，
	// 比如: 5 0
	// 10 10*9*8*7*6*5*4*3*2*1 5 10 有两个因子 所以末尾有两个零
	public static void main(String[] args) {
		// res 阶乘总和 s当前阶乘总和
		long res = 0, s = 1;
		for (int i = 1; i <= 40; i++) {
			// 循环计算
			s = s * i % MOD;
			res = (res + s) % MOD;
		}

		System.out.println(res);
	}
}

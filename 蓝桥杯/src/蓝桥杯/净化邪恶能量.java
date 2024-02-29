package 蓝桥杯;

import java.util.Scanner;

public class 净化邪恶能量 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, ans = 1;
		int x = sc.nextInt();
		if(x ==0) {
			System.out.print(ans);
			return;
		}
		while (x > 0) {
			sum = he(x);
			x -= sum;
			ans++;
		}
		System.out.print(ans);
		sc.close();
	}

	public static int he(int a) {
		int n = 0;
		while (a > 0) {
			n += a % 10;
			a /= 10;
		}
		return n;
	}
}

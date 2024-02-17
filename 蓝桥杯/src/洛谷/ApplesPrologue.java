package 洛谷;

import java.util.Scanner;

public class ApplesPrologue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double m, t, s = 0;
		m = sc.nextDouble();
		t = sc.nextDouble();
		s = sc.nextDouble();
		if (t == 0) {
			System.out.print("0");
			return;
		}
		int ans = (int) (m - (int) Math.ceil(s / t));
		System.out.print(ans > 0 ? ans : 0);
		sc.close();

	}

}

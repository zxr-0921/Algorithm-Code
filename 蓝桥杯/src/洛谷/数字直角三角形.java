package 洛谷;

import java.util.Scanner;

public class 数字直角三角形 {
	public static void main(String[] args) {
		int n = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (b < 10) {
					System.out.print("0" + b++);
				} else {
					System.out.print(b++);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

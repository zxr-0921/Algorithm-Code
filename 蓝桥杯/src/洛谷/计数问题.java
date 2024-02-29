package 洛谷;

import java.util.Scanner;

public class 计数问题 {
	public static int M = 10000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0, x = 0, sum = 0, flag = 1;
		n = sc.nextInt();
		x = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			flag = i;
			while (flag > 0) {
				if (flag % 10 == x) {
					sum++;
				}
				flag /= 10;
			}
		}
		System.out.print(sum);
		sc.close();

	}

}

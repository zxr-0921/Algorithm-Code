package 洛谷;

import java.util.Scanner;

public class 月份天数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m = 0;
		y = sc.nextInt();
		m = sc.nextInt();
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.print("31");
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.print("30");
		}
		if (m == 2) {
			if (isYear(y)) {
				System.out.print("29");
			} else {
				System.out.print("28");
			}
		}
		sc.close();
	}

	public static boolean isYear(int n) {
		if (n % 4 == 0 && n % 100 != 0) {
			return true;
		} else if (n % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}

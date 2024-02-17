package 洛谷;

import java.util.Scanner;

public class 洛谷团队系统 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		shortTime(n);
		sc.close();

	}

	public static void shortTime(int n) {
		int local = n * 5;
		int luogu = n * 3 + 11;
		if (luogu > local) {
			System.out.print("Local");
		} else {
			System.out.print("Luogu");
		}
	}
}

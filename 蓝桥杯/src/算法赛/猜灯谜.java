package 算法赛;

import java.util.Scanner;

public class 猜灯谜 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		int[] m = new int[n];
		int[] mer = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				mer[i] = m[i + 1] + m[n - 1];
			} else if (i == n - 1) {
				mer[i] = m[0] + m[i - 1];
			} else {
				mer[i] = m[i + 1] + m[i - 1];
			}
		}
		for (int ms : mer) {
			System.out.print(ms + " ");
		}
		sc.close();

	}

}

package 洛谷;

import java.util.Scanner;

public class 冰雹猜想 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0, flag = 0;
		n = sc.nextInt();
		int[] a = new int[500];
		a[flag++] = n;
		while (n != 1) {
			if (n % 2 != 0) {
				n = n * 3 + 1;
				a[flag++] = n;
			} else {
				n /= 2;
				a[flag++] = n;
			}
		}
		for (int i = flag - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}

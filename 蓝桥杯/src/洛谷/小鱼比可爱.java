package 洛谷;

import java.util.Scanner;

public class 小鱼比可爱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0;
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					sum++;
				}
			}
			arr[i] = sum;
			sum = 0;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}

package 蓝桥杯;

import java.util.Scanner;

public class 异或和之和 {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] A = new int[n];
		scan.nextLine();
		String line = scan.nextLine();
		String[] arr = line.split(" ");
//		存储数组
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(arr[i]);
		}

		int left = 0;
		int right = 0;
		int sum = 0;
		int half = 0;
		while (left <= A.length - 1) {
			for (right = left; right < A.length; right++) {
				half ^= A[right];
			}
			sum += half;
			left++;
		}

		System.out.println(sum);
//		for (int j = 0; j < n; j++) {
//			System.out.println(A[j]);
//		}
		scan.close();
	}
}

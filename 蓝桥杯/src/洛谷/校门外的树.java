package 洛谷;

import java.util.Arrays;
import java.util.Scanner;

public class 校门外的树 {

	public static void main(String[] args) {
		// 思路:用数组表示种植的树1，移除则将为0
		Scanner sc = new Scanner(System.in);
		int l = 0, m = 0, sum = 0;
		l = sc.nextInt();
		m = sc.nextInt();
		int[] tree = new int[l + 2];
		// 表示种植的所有树
		Arrays.fill(tree, 1);
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Arrays.fill(tree, a, b + 1, 0);
		}
		for (int i = 0; i <= l; i++) {
			sum += tree[i];
		}
		System.out.print(sum);
		sc.close();

	}

}

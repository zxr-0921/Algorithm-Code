package 算法赛;

import java.util.Scanner;

public class 星期几 {

	public static void main(String[] args) {
		int[] week = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		int w = 0, n = 0, flag = 0;
		w = sc.nextInt();
		n = sc.nextInt();
		flag = w % 7;
		while (n > 0) {
			if (flag == 7) {
				flag = 1;
				n--;
				continue;
			}
			flag++;
			n--;
		}
		System.out.print(flag);
		sc.close();

	}
}

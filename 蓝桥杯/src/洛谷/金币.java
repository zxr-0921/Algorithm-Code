package 洛谷;

import java.util.Scanner;

public class 金币 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = 0, sum = 0, q = 0, c = 0;
		k = sc.nextInt();
		c = q = 1;
		for (int i = 0; i < k; i++) {
			sum += c;
			q--;
			if (q == 0) {
				c++;
				q = c;
			}
		}
		System.out.print(sum);
		sc.close();
	}
}

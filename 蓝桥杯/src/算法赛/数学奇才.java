package 算法赛;

import java.util.Scanner;

public class 数学奇才 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long sum = 0,m = 0;
		int n = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			m = sc.nextLong();
			if (m < 0) {
				sum -= m;
			} else {
				sum += m;
			}
		}
		System.out.print(sum);
		sc.close();

	}

}

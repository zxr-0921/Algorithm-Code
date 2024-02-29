package 洛谷;

import java.util.Scanner;

public class 数列求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0,sum = 0;
		n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum);
		sc.close();
	}

}

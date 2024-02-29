package 洛谷;

import java.util.Scanner;

public class 一尺之棰 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int sum = 1;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		while (a != 1) {
			a /= 2;
			sum++;
		}
		System.out.print(sum);
		sc.close();
	}

}

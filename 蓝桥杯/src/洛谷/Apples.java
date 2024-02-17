package 洛谷;

import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 1 || x == 0) {
			System.out.print("Today, I ate " + x + " apple.");
		} else {
			System.out.print("Today, I ate " + x + " apples.");
		}
		sc.close();

	}

}

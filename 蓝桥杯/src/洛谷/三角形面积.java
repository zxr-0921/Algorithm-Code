package 洛谷;

import java.util.Scanner;

public class 三角形面积 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double q = (a + b + c) / 2;
		double s = Math.sqrt(q * (q - a) * (q - b) * (q - c));
		System.out.printf("%.1f%n", s);
		sc.close();
	}
}

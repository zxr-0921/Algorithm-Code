package 洛谷;

import java.util.Scanner;

public class 距离函数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		a = distance(x1, y1, x2, y2);
		b = distance(x1, y1, x3, y3);
		c = distance(x2, y2, x3, y3);
		double ans = a + b + c;
//		String dis = String.format("%.2f", ans);
		System.out.printf("%.2f", ans);
		sc.close();

	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		double dis = Math.sqrt(x + y);
		return dis;
	}

}

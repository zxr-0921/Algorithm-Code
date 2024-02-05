package 蓝桥杯;

import java.util.*;

public class 矩形总面积 {
	private static long x1, y1, x2, y2, x3, y3, x4, y4;

//	面积
	private static long getArea(long x1, long y1, long x2, long y2) {
		return (x2 - x1) * (y2 - y1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		x1 = scan.nextLong();
		y1 = scan.nextLong();
		x2 = scan.nextLong();
		y2 = scan.nextLong();
		x3 = scan.nextLong();
		y3 = scan.nextLong();
		x4 = scan.nextLong();
		y4 = scan.nextLong();

//		两个矩形的面积
		long res = getArea(x1, y1, x2, y2) + getArea(x3, y3, x4, y4);
//		相交的面积
		long overlapX = Math.max(0, Math.min(x2, x4) - Math.max(x1, x3));
		long overlapY = Math.max(0, Math.min(y2, y4) - Math.max(y1, y3));

		res -= overlapX * overlapY;
		System.out.println(res);
		scan.close();

	}

}

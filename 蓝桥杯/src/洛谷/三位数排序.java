package 洛谷;

import java.util.Scanner;

public class 三位数排序 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// 使用嵌套的if语句进行排序
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		// 打印排序后的数字
		System.out.println(a + " " + b + " " + c);
		sc.close();
	}
}

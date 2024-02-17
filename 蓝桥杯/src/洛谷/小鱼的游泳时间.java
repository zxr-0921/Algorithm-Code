package 洛谷;

import java.util.Scanner;

public class 小鱼的游泳时间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, d = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		int begin = a * 60 + b;
		int end = c * 60 + d;
		int hour = (end - begin) / 60;
		int minute = (end - begin) % 60;
		System.out.print(hour + " " + minute);
		sc.close();

	}

}

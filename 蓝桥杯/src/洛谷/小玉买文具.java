package 洛谷;

import java.util.Scanner;

public class 小玉买文具 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		int jiao = a *10+b;
		int ans = (int) Math.floor(jiao/19);
		System.out.print(ans);
		sc.close();
	}
}

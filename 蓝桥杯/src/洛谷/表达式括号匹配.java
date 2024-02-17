package 洛谷;

import java.util.Scanner;

public class 表达式括号匹配 {
	public static char[] c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		c = sc.nextLine().toCharArray();
		int s = 0;
		int a = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				s++;
			}
			if (a > s) {
				System.out.print("NO");
				return;
			}
			if (c[i] == ')') {
				a++;
			}
		}
		if (s == a) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
		sc.close();

	}

}

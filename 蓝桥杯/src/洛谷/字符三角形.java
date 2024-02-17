package 洛谷;

import java.util.Scanner;

public class 字符三角形 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);

		// 构造等腰字符三角形
		for (int i = 1; i <= 3; i++) { // 高度为3
			for (int j = 1; j <= 3 - i; j++) { // 打印前导空格
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) { // 打印字符
				System.out.print(c);
			}
			System.out.println(); // 换行
		}
	}
}

package 洛谷;

import java.util.Scanner;

public class 小鱼的数字游戏 {
	public static String[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = sc.nextLine().split(" ");
		for (int i = arr.length - 2; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}

package 洛谷;

import java.util.Scanner;

public class 数字翻转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		for(int i = s.length-1;i>=0;i--) {
			System.out.print(s[i]);
		}
		sc.close();
	}

}

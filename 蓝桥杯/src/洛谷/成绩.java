package 洛谷;

import java.util.Scanner;

public class 成绩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A,B,C = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		int ans = (int) (A*0.2+B*0.3+C*0.5);
		System.out.print(ans);
		sc.close();
	}

}

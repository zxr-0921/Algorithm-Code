package 简单题;

import java.util.Scanner;

public class 新一的神秘信号4181 {
	private static int N;
	private static int Y;
	private static int X;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Y = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			X |= A[i];
		}

//		Y的取值范围是20，所以i取20
		for (int i = 20; i >= 0; i--) {
			if (((X & (1 << i)) > 0) && ((Y & (1 << i)) == 0)) {
				System.out.print(-1);
				return;
			} else {
//				异或算出X的值
				X ^= Y;
			}
		}

		System.out.println(X);

		sc.close();

	}

}

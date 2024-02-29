package 洛谷;

import java.util.Scanner;

public class 不高兴的津津 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 0;
		int[] hs = new int[7];
		for (int i = 0; i < 7; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			hs[i] = a + b;
		}
		int max = 8;
		int flag = 0;
		for (int i = 0; i < hs.length; i++) {
			if(hs[i]>max) {
				max = hs[i];
				flag= i+1;
			}
		}

		System.out.print(flag);
		sc.close();
	}

}

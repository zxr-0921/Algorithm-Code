package 洛谷;

import java.util.Scanner;

public class 大象喝水 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = 0, r = 0;
		h = sc.nextInt();
		r = sc.nextInt();
		double volume = 3.14 * Math.pow(r, 2) * h * 0.001;
		int bucket = (int) Math.ceil(20 / volume);
		System.out.print(bucket);
		sc.close();
	}

}

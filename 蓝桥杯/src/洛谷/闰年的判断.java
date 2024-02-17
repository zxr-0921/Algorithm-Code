package 洛谷;

import java.util.Scanner;

public class 闰年的判断 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1、可以被4整除；2、不可以被100整除；3、可以被400整除.
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0&&year%100!=0) {
			System.out.print("1");
		}else if(year%400 ==0) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
		sc.close();
	}

}

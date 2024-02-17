package 洛谷;

import java.util.Scanner;

public class 数的性质 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isXing(num)==2) {
			System.out.print("1"+" "+"1"+" "+"0"+" "+"0");
		}else if(isXing(num)==1) {
			System.out.print("0"+" "+"1"+" "+"1"+" "+"0");
		}else {
			System.out.print("0"+" "+"0"+" "+"0"+" "+"1");
		}
		sc.close();
		
	}
	public static int isXing(int n) {
		if(n%2==0&&(n>4&&n<=12)) {
			return 2;
		}else if(n%2==0||(n>4&&n<=12)) {
			return 1;
		}else{
			return 0;
		}
	}

}

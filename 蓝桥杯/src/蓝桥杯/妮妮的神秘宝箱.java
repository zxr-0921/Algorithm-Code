package 蓝桥杯;

import java.util.Scanner;

public class 妮妮的神秘宝箱 {
	public static int MAX=100001;
	public static char[] c = new char[MAX];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c=sc.nextLine().toCharArray();
		long m = 0,n = 0,p=0;
		for(int ca :c) {
			if(ca=='(') m++;
			if(ca==')') m--;
			if(ca=='[') n++;
			if(ca==']') n--;
			if(ca=='{') p++;
			if(ca=='}') p--;
		}
		if(m==0&&n==0&&p==0) {
			System.out.print("Y");
		}else {
			System.out.print("N");
		}
		sc.close();
	}

}

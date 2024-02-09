package 蓝桥杯;

import java.util.Scanner;

public class 小蓝的括号串1 {
	public static int n;
	public static char[] c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine(); //读掉回车
		c = sc.nextLine().toCharArray();
//		System.out.print(n);
//		for(char ca : c ) {
//			System.out.print(ca+" ");
//		}
		int z = 0;
		//遍历字符数组
		for(char ca : c ) {
			if(z!=0) {
				if(ca=='(') {
					z++;
				}else {
					z--;
				}
			}else {
				if(ca == '(') z++;
			}
		
		}
		if(z==0) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		
		sc.close();
		

	}

}

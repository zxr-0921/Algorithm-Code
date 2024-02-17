package 洛谷;

import java.util.Scanner;

public class 肥胖问题 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m,h = 0;
		m = sc.nextDouble();
		h = sc.nextDouble();
		double ibm = m/Math.pow(h,2);
		if(ibm<18.5) {
			System.out.print("Underweight");
		}else if(ibm>=18.5&&ibm<24) {
			System.out.print("Normal");
		}else {
			String str = String.format("%.6g", ibm);
			System.out.println(str);
			System.out.print("Overweight");
		}
		sc.close();
	}

}

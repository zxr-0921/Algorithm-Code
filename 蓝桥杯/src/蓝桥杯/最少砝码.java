package 蓝桥杯;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class 最少砝码 {

	public static int n;
	public static int sum = 1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n == 1) {
			System.out.print(sum);
			return;
		}
		// 将这个数与2的n次方比较
		for (int i = 0; i < 30; i++) {
			sum *= 2;
			if (sum == n) {
				System.out.print(i);
				break;
			}
			if (sum > n) {
				System.out.print(i - 1);
				break;
			}
		}

		sc.close();
	}

}

package 蓝桥杯;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 小桥的神秘礼物盒 {

	public static int n;
	public static int op;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		n = scan.nextInt();
		while (n-- > 0) {
			op = scan.nextInt();
			if (op == 1) {
				int x = scan.nextInt();
				q.add(x);
			} else if (op == 2) {
				if (q.isEmpty()) {
					System.out.println("lan");
				} else {
					q.poll();
				}
			} else if (op == 3) {
				if (q.isEmpty()) {
					System.out.println("qiao");
				} else {
					System.out.println(q.peek());
				}
			} else {
				System.out.println(q.size());
			}
		}
		scan.close();
	}
}

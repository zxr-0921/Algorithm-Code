package 蓝桥杯;

import java.util.Scanner;
import java.util.Stack;

public class 小邋遢的衣橱 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();// 回车
		for (int i = 0; i < n; i++) {
			String string[] = scanner.nextLine().split(" ");
			if (string[0].equals("in")) {
				stack.add(string[1]);
			} else {
				while (!stack.peek().equals(string[1])) {
					stack.pop();
				}
				stack.pop();
			}
		}
		if (stack.empty()) {
			System.out.println("Empty");
		} else {
			System.out.println(stack.peek());
		}
	}
}
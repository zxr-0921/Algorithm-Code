package 洛谷;

import java.util.Scanner;

public class 栈 {
//	题目中数据量过大无法通过
	static class Stack {
		public long[] stack;
		public int size;

		// 初始化栈
		public Stack(int n) {
			stack = new long[n];
			size = 0;
		}

		// 判断栈是否为空
		public boolean isEmpty() {
			return size == 0;
		}

		// 入栈
		public void push(long num) {
			stack[size++] = num;
		}

		// 出栈
		public long pop() {
			return stack[--size];
		}

		public long query() {
			return stack[size - 1];

		}

		public int size() {
			return size;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = 0, n = 0;
				long x = 0;
		String op;
		t = sc.nextInt();
		Stack st = new Stack(1000001);
		while (t > 0) {
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				op = sc.next();
				if (op.equals("push")) {
					x = sc.nextLong();
					st.push(x);
				} else if (op.equals("pop")) {
					if (st.isEmpty()) {
						System.out.println("Empty");
					} else {
						st.pop();
					}
				} else if (op.equals("query")) {
					if (st.isEmpty()) {
						System.out.println("Anguei!");
					} else {
						System.out.println(st.query());
					}
				} else {
					System.out.println(st.size());

				}

			}
			t--;
		}
		sc.close();

	}

}

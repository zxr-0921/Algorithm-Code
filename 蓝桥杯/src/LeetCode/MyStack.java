package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> queue;

	public MyStack() {
		queue = new LinkedList<Integer>();

	}

	public void push(int x) {
		int n = queue.size();
		queue.add(x);
		for (int i = 0; i < n; i++) {
			int a = queue.poll();
			queue.add(a);
		}

	}

	public int pop() {
		return queue.poll();

	}

	public int top() {
		return queue.peek();

	}

	public boolean empty() {
		return queue.isEmpty();

	}
}

package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class MyCircularDeque {
	public Deque<Integer> deque = new LinkedList<Integer>();
	public int size;
	public int limit;

//	初始化队列
	public MyCircularDeque(int k) {
		size = 0;
		limit = k;
	}

	// 从前面插入
	public boolean insertFront(int value) {
		if (isFull()) {
			return false;
		} else {
			deque.offerFirst(value);
			size++;
			return true;
		}

	}

	// 从后面插入
	public boolean insertLast(int value) {
		if (isFull()) {
			return false;
		} else {
			deque.offerLast(value);
			size++;
			return true;
		}
	}

	public boolean deleteFront() {
		if (isEmpty()) {
			return false;
		} else {
			size--;
			deque.pollFirst();
			return true;
		}

	}

	public boolean deleteLast() {
		if (isEmpty()) {
			return false;
		} else {
			size--;
			deque.pollLast();
			return true;
		}

	}

	public int getFront() {
		if (isEmpty()) {
			return -1;
		} else {
			return deque.peekFirst();
		}

	}

	public int getRear() {
		if (isEmpty()) {
			return -1;
		} else {
			return deque.peekLast();
		}

	}

	public boolean isEmpty() {
		return size == 0;

	}

	public boolean isFull() {
		return size == limit;

	}
}

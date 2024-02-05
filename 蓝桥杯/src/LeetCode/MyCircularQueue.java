package LeetCode;

//循环队列
public class MyCircularQueue {
	// 结构
	int[] queue;
	int l, r, size, limit;

	// 构造函数
	public MyCircularQueue(int k) {
		queue = new int[k];
		int l = r = size = 0;
		limit = k;
	}

	// 插入元素
	// 如果队列满了，返回false
	// 如果队列没满了，返回true
	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		} else {
			queue[r] = value;
			// r++
			r = r == limit - 1 ? 0 : (r + 1);
			size++;
			return true;
		}
	}

	// 出队列
	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		} else {
			l = l == limit - 1 ? 0 : (l + 1);
			size--;
			return true;
		}
	}

	public int Front() {
		if (isEmpty()) {
			return -1;
		} else {
			return queue[l];
		}
	}

	public int Rear() {
		if (isEmpty()) {
			return -1;
		} else {
			int last = r == 0 ? (limit - 1) : (r - 1);
			return queue[last];
		}

	}

	public boolean isEmpty() {
		return size == 0;

	}

	public boolean isFull() {
		return size == limit;

	}
}

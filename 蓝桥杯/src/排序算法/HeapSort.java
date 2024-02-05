package 排序算法;

public class HeapSort {

	// i位置的数，向上调整大根堆
	// arr[i] = x，x是新来的！往上看，直到不比父亲大，或者来到0位置(顶)
	public static void heapInsert(int[] arr, int i) {
		while (arr[i] > arr[(i - 1) / 2]) {
			// 交换两个数的位置
			swap(arr, i, (i - 1) / 2);
			// i变成父节点
			i = (i - 1) / 2;
		}
	}

	// i位置的数，变小了，又想维持大根堆结构
	// 向下调整大根堆
	// 当前堆的大小为size
	public static void heapify(int[] arr, int i, int size) {
		// 左孩子
		int l = i * 2 + 1;
		while (l < size) {
			// 有左孩子和右孩子
			// 右孩子不要超过size,比较左右子节点，选出最大的
			int best = l + 1 < size && arr[l + 1] > arr[l] ? l + 1 : l;
			// 上面已经评选了最强的孩子，接下来，当前的数和最强的孩子之前，最强下标是谁
			best = arr[best] > arr[i] ? best : i;
			// 如果i跟best一样
			if (best == i) {
				break;
			}
			// 交换位置
			swap(arr, best, i);
			i = best;
			l = i * 2 + 1;

		}
	}

	public static void heapSort(int[] arr) {
		int n = arr.length;
		// 从顶至底建立大根堆
		for (int i = 0; i < n; i++) {
			heapInsert(arr, i);
		}
		int size = n;
		while (size > 1) {
			// 交换第一个和最后一个
			swap(arr, 0, --size);
			// 将第一个最大的数往下走，再次形成大根堆
			heapify(arr, 0, size);
		}
	}

	// 交换两个数的位置
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}

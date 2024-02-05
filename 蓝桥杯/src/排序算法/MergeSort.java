package 排序算法;

//归并排序
public class MergeSort {

	// 排序
	public static void sort(int[] arr, int l, int r) {
		if (l == r) {
			return;
		}
		int m = l + (r - l) / 2;
		// 左边排序
		sort(arr, l, m);
		// 右边排序
		sort(arr, m + 1, r);
		// 合并成一个有序数组
		merge(arr, l, m, r);
	}

	public static void merge(int[] arr, int l, int m, int r) {
		// 创建一个辅助数组
		int[] help = new int[l - r + 1];
		int i = 0; // help下标
		int p1 = l;
		int p2 = m + 1;
		// 当p1 p2都不越界的时候，赋值给help
		while (p1 <= m && p2 <= r) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		// 当其中一个越界
		while (p1 <= m) { // 左边没越界
			help[i++] = arr[p1++];
		}

		while (p2 <= r) { // 右边没越界
			help[i++] = arr[p2++];
		}

		// 重新把help复制回arr
		for (int j = 0; j < help.length; j++) {
			arr[l + j] = help[j];
		}

	}

	public static void main(String[] args) {

	}

}

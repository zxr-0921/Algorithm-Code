package LeetCode;

public class 颜色分类 {

	public static void quickSort(int[] arr, int l, int r) {
		// 递归出口
		if (l >= r) {
			return;
		}

		int mid = arr[l + (int) (Math.random() * (r - l + 1))];
		// 排序
		partition(arr, l, r, mid);
		// 每次遍历排序完的边界
		int left = first;
		int right = last;
		// 左边排好序
		quickSort(arr, l, left - 1);
		// 右边排好序
		quickSort(arr, right + 1, r);

	}

	// 准备两个变量
	public static int first, last;

	public static void partition(int[] arr, int l, int r, int x) {
		first = l; // 左边的区域
		last = r; // 右边的区域
		int i = l;
		while (i <= last) {
			if (arr[i] == x) {
				i++;
			} else if (arr[i] < x) {
				swap(arr, first++, i++);
			} else {
				swap(arr, last--, i);

			}
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

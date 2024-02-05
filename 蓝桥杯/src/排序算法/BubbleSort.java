package 排序算法;

//冒泡排序
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		if (arr.length < 2 || arr == null)
			return;

		for (int e = arr.length - 1; e > 0; e--) {
			for (int i = 0; i < e; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}

	}

//	交换
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 3, 7, 4, 9, 5, 8 };
		bubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}

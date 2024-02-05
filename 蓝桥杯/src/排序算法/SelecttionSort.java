package 排序算法;

//选择排序
public class SelecttionSort {
//	选择排序
	public static void selectSort(int[] arr) {
//		如果数组为空或长度小于1
		if (arr == null || arr.length < 2) {
			return;
		}
//		指向i~n-1范围的第一个
		for (int i = 0; i < arr.length; i++) {
//			最小值的下标
			int minIndex = i;
//			找到最小的值
			for (int j = i + 1; j < arr.length; j++) {
//				遍历i后的元素是否有比arr[minIndex]小，则赋值minIndex
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
//			交换两个数的位置
			swap(arr, i, minIndex);
		}
	}

//	交换
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 7, 4, 9, 5, 8 };
		selectSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

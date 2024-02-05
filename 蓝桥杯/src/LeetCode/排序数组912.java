package LeetCode;

public class 排序数组912 {
	public int[] sortArray(int[] nums) {
		if (nums == null || nums.length < 2) {
			return nums;
		}
		int n = nums.length;
		// 冒泡排序
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < n - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					swap(nums, j, j + 1);
				}
			}
		}
		return nums;
	}

	public static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

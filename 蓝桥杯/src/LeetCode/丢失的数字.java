package LeetCode;

public class 丢失的数字 {
	public int missingNumber(int[] nums) {
//		[0,1] n=2 缺少2
//		eorAll = 0,1,2
		int eorAll = 0, eorHas = 0;
		for (int i = 0; i < nums.length; i++) {
			eorAll ^= i;
			eorHas ^= nums[i];
		}
//		最后异或上最后一个数
		eorAll ^= nums.length;
		return eorAll ^ eorHas;

	}

}

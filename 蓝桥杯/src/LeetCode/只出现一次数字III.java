package LeetCode;

public class 只出现一次数字III {
	public int[] singleNumber(int[] nums) {
		// 思路：将a和b分开，在某一位上的是不同的
		// eor1 : a ^ b
		// Brian Kernighan算法
		int eor1 = 0;
		for (int num : nums) {
			eor1 ^= num;
		}
		// 提取出二进制里最右侧的1   相反数
//		int rightOne = eor1 & (~eor1+1);
		int rightOne = eor1 & (-eor1);
		int eor2 = 0;
		for (int num : nums) {
			if ((num & rightOne) == 0) {
				eor2 ^= num;
			}
		}
		return new int[] { eor2, eor1 ^ eor2 };
	}

}

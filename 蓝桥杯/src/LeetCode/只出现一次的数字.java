package LeetCode;

public class 只出现一次的数字 {
	public int singleNumber(int[] nums) {
        int eorAll = 0;
        // 异或偶数会被消掉
        for (int n : nums) {
            eorAll ^= n;
        }
        return eorAll;

    }

}

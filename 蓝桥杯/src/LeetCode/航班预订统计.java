package LeetCode;

public class 航班预订统计 {
	public int[] corpFlightBookings(int[][] bookings, int n) {
		// 因为航班有n架，
		//    1 2 3 4 5
		// [0,1,2,3,4,5,6]
		int[] cnt = new int[n+2];
		// 设置差分数组，每个操作对应两个设置
		for(int[] book : bookings) {
			// 开始
			cnt[book[0]]+=book[2];
			// 结束的下一位
			cnt[book[1]+1]-=book[2];
		}
		
		// 加工前缀和
		for(int i = 1;i<cnt.length;i++) {
			cnt[i]+=cnt[i-1];
		}
		// 复制数组
		int[] ans = new int[n];
		for(int i = 0;i<ans.length;i++) {
			ans[i]=cnt[i+1];
		}
		
		return ans;

	}
	
	
}

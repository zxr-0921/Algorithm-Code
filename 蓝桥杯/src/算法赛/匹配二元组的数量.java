package 算法赛;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 匹配二元组的数量 {
	public static int n;
	public static int[] az;
	public static int ans;
	public static int[] as;
	public static int ans1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		// 在此输入您的代码...
		n = sc.nextInt();
		az = new int[n+1];
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			az[i] = sc.nextInt();
		}
		as = new int[n+1];
		Arrays.fill(as, 0);
		
		for(int i = 1;i<=n;i++) {
			ans=az[i]*i;
			as[ans]++;
		}
		for(int i = 0;i<=n;i++) {
			ans1+=(as[i]*(as[i]-1))/2;
		}
		System.out.print(ans1);

		sc.close();
	}

}

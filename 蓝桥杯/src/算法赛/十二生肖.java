package 算法赛;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 十二生肖 {
	public static int n;
	public static String s;
	public static boolean st;
	public static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if (hm.containsKey(m)) {
				if (hm.get(m) != n) {
					hm.put(m, n);
					ans++;
					continue;
				}
				continue;
			}
			hm.put(m, n);
			ans++;

		}
		System.out.print(ans);
		sc.close();

	}

}

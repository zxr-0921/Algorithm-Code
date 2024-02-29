package 算法赛;

public class 大乘积 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = 0;
		int[] c = new int[] { 99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28,
				84, 34, 96, 52, 82, 51, 77 };
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] * c[j] >= 2022) {
					ans++;
				}
			}
		}
		System.out.print(ans);
	}

}

package 算法赛;

import java.util.HashMap;
import java.util.Scanner;

public class 自助餐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		Scanner scan = new Scanner(System.in);
		// 在此输入您的代码...
		n = scan.nextInt();
		scan.nextLine();
		str = scan.nextLine();
		String[] arr = str.split(" ");
//		for(int i = 0; i<n;i++) {
//			System.out.println(arr[i]);
//		}
		HashMap<String, Integer> hm = new HashMap();
		hm.put("yuanxing", 1);
		hm.put("zhengfangxing", 2);
		hm.put("changfangxing", 3);
		hm.put("sanjiaoxing", 4);
		hm.put("tuoyuanxing", 5);
		hm.put("liubianxing", 6);

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += hm.get(arr[i]);
		}
		System.out.println(sum);

		scan.close();

	}

}

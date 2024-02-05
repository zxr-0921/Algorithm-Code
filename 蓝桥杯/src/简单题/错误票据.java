/**
 * 
 */
package 简单题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public class 错误票据 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
//		TreeSet<Integer> ts = new TreeSet<Integer>();
		int N = sc.nextInt();
		sc.nextLine();
//		获取输入的数据，封装成一个集合
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();
			String[] split = line.split(" ");
			for (int j = 0; j < split.length; j++) {
				list.add(Integer.parseInt(split[j]));
			}
		}
//		排序
		Collections.sort(list);

		int a = 0, b = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) - list.get(i - 1) == 2)
				a = list.get(i) - 1;
			// 不能直接用==，因为获取出来的是对象
			if (list.get(i).equals(list.get(i - 1)))
				b = list.get(i);
		}
		System.out.println(a + " " + b);

		sc.close();

	}

}

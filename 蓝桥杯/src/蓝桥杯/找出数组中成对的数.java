package 蓝桥杯;  //这个是不能要的

import java.util.Random;

public class 找出数组中成对的数 {
	public static void main(String[] args) {
		int N = 1001;
		int[] arr = new int[N];
		//除去最后一个数，前面的数
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = i+1;
		}
		//最后一个是随机数，取不到最后一个数
		arr[arr.length-1] = new Random().nextInt(N-1)+1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
//		int index = new Random().nextInt(N);
		int x1 = 0;
		//异或运算，消除相同的数,目的是跟后面的异或抵消
		for(int i = 1 ; i <= N-1; i++) {
			x1 = (x1^i);
		}
//		System.out.println("x1="+x1);
		for(int i = 0;i < N; i++) {
			x1 = x1^arr[i];
//			System.out.print(x1+",");
		}
		System.out.println("["+x1);
	}

}

package 洛谷;

import java.util.Scanner;

public class 质数口袋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L = 0,sum = 0,ans = 0;
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		for(int i = 2;;i++) {
			// 判断是否质数，并且总和是否小于L
			if(isPrime(i)) {
				if(sum+i<=L) {
					sum+=i;
					ans++;
					System.out.println(i);
				}else {
					break;
				}
				
			}
		}
		System.out.print(ans);
		sc.close();

	}
	
	public static boolean isPrime(int number) {
		 // 负数、0和1不是质数
        if (number <= 1) {
            return false;
        }
        // 2是最小的质数
        if (number == 2) {
            return true;
        }
        // 偶数不是质数（除了2）
        if (number % 2 == 0) {
            return false;
        }
        // 只需检查奇数因子
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        // 如果没有发现因子，则它是质数
        return true;
	}

}

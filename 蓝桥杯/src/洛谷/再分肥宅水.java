package 洛谷;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class 再分肥宅水 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = scanner.nextInt();
        // 使用BigDecimal进行精确的浮点数运算，并保留3位小数
        BigDecimal bdA = new BigDecimal(Double.toString(a));
        BigDecimal bdB = new BigDecimal(Integer.toString(b));
        BigDecimal result = bdA.divide(bdB, 3, RoundingMode.HALF_UP); // 保留3位小数
        System.out.printf("%.3f\n", result); // 输出保留3位小数的结果
        System.out.println(b * 2); // 输出整数乘法的结果
	}

}

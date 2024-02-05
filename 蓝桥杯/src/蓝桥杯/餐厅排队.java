package 蓝桥杯;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class 餐厅排队 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        Deque<Integer> q = new ArrayDeque<Integer>();
        while (Q-- > 0) {
            int op = scanner.nextInt();
            if (op == 1) {
                int x = scanner.nextInt();
                q.addLast(x);
            } else if (op == 2) {
                q.removeFirst();
            } else {
                System.out.println(q.getFirst() + " " + q.getLast());
            }
        }
        scanner.close();
    }
}
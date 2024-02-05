package LeetCode;

public class 链表相加 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 创建两个指针ans，cur
		ListNode ans = null, cur = null;
		// 创建两个变量
		int sum = 0, carry = 0, val = 0;
		// 当两个值一个不为空的时候
		while (l1 != null || l2 != null) {
			sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			val = sum % 10;
			carry = sum / 10; // 进制1,0
			if (ans == null) {
				ans = new ListNode(val);
				cur = ans;
			} else {
				cur.next = new ListNode(val);
				cur = cur.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		if (carry == 1) {
			cur.next = new ListNode(1);
		}

		return ans;
	}
}

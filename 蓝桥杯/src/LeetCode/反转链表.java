package LeetCode;

public class 反转链表 {

//	反转列表
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

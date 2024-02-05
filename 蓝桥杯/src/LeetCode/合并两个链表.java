package LeetCode;

public class 合并两个链表 {

	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		ListNode pre = null;
		ListNode next = list1;
		int flag = 0;
		ListNode right = null;
		// 找到a-1节点，b节点
		while (list1.next != null) {
			list1 = list1.next;
			flag++;
			if (flag == a - 1) {
				pre = next;
			}
			if (flag == b) {
				right = next;
			}
		}
		// 拼接list2
		pre.next = list2;
		while (list2.next != null) {
			list2 = list2.next;
		}

		list2.next = right.next;

		return next;
	}

	public static void main(String[] args) {

	}

}

package LeetCode;

import java.util.HashSet;
import java.util.Set;

import LeetCode.相交链表.ListNode;

public class 相交链表 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<ListNode>();
		ListNode temp = headA;
		while (temp != null) {
			set.add(temp);
			temp = temp.next;
		}
		temp = headB;
		while (temp != null) {
			if (set.contains(temp)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
}

package LeetCode;

public class 合并两个有序的链表 {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// 判断list1 和 list2是否为空，其中一个链表为空的话，则返回另一个链表
		if (list1 == null || list2 == null) {
			return list1 == null ? list2 : list1;
		}
		// 两个都不为空
		// 定义三个变量 cur1 cur2 pre pre指向合并后链表的最后一个
		// 初始化
		ListNode head = list1.val < list2.val ? list1 : list2; // 比较两个链表第一个值，谁小谁是head
		ListNode cur1 = head.next; // head节点下一个
		ListNode cur2 = head == list1 ? list2 : list1; // 如果指向了list1，cur2则指向另一条链
		ListNode pre = head;
		// 当cur1 cur2 指向的节点都不为空的时候，循环
		while (cur1 != null && cur2 != null) {
			if (cur1.val >= cur2.val) { // 判断节点的值谁大
				pre.next = cur2;
				cur2 = cur2.next; // 指针往后移动一位
			} else {
				pre.next = cur1;
				cur1 = cur1.next;
			}
			pre = pre.next; // pre指向最后一位
		}

		pre.next = cur1 == null ? cur2 : cur1;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

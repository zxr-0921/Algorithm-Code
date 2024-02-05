package LeetCode;

public class 分隔链表 {
	public ListNode partition(ListNode head, int x) {
		ListNode leftHead = null, leftTail = null;
		ListNode rightHead = null, rightTail = null;
		ListNode next = null;
		while (next != null) {
			// 记录下一个节点的位置，防止断联
			next = head.next;
			head.next = null;
			// 判断当前节点大于X,在右边
			if (head.val >= x) {
				if (rightHead == null) {
					rightHead = head;
				} else {
					rightTail.next = head;
				}
				rightTail = head;
			} else {
				if (leftHead == null) {
					leftHead = head;
				} else {
					leftTail.next = head;
				}
				leftTail = head;
			}
			head = next;
		}
//		如果小于区域没有数，则返回右边区域的
		if (leftHead == null) {
			return rightHead;
		}
		leftTail.next = rightHead;
		return leftHead;

	}

}

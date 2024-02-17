package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorder {
	public List<Integer> preorderTraversal(TreeNode root) {
		return preOrder(root);
	}

	public static List<Integer> preOrder(TreeNode head) {
		// 创建一个集合
		List<Integer> list = new ArrayList<Integer>();
		if (head != null) {
			// 创建一个栈
			Stack<TreeNode> st = new Stack<TreeNode>();
			// 头结点进栈
			st.push(head);
			// 如果栈不为空
			while (!st.isEmpty()) {
				// 出栈
				head = st.pop();
				// 并且添加到集合中
				list.add(head.val);
				// 如果右节点不为空
				if (head.right != null) {
					st.push(head.right);
				}
				// 如果左节点不为空
				if (head.left != null) {
					st.push(head.left);
				}
			}
		}
		return list;
	}
}

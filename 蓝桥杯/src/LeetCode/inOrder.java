package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inOrder {

	// 思路：当栈不为空并且当前节点不为空时，进入循环
	// 如果当前节点不为空则将左子树压栈，当它为空时，便出栈，并打印再到右子树
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root != null) {
			Stack<TreeNode> st = new Stack<TreeNode>();
			while (!st.isEmpty() || root != null) {
				// 当前节点不为空，往左边走
				if (root != null) { // 中左
					st.push(root);
					root = root.left;
				} else {
					// 出栈后往右边子树
					root = st.pop(); // 出栈 左中
					list.add(root.val);
					root = root.right; // 右
				}
			}
		}
		return list;

	}
}

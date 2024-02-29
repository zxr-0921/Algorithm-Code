package LeetCode;

import java.util.Stack;

public class 二叉搜索树的范围和 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int rangeSumBST(TreeNode root, int low, int high) {
		int sum = 0;
		if (root == null) {
			return 0;
		}
		Stack<TreeNode> st = new Stack();
		st.push(root);
		while (!st.isEmpty()) {
			root = st.pop();
			if (root.val >= low && root.val <= high) {
				sum += root.val;
			}

			if (root.right != null) {
				st.push(root.right);
			}
			if (root.left != null) {
				st.push(root.left);
			}
		}
		return sum;

	}
}

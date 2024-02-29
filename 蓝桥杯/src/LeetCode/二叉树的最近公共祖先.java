package LeetCode;

public class 二叉树的最近公共祖先 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// 如果头结点为空或者头结点是其中一个
		if (root == null || root == q || root == p) {
			return root;
		}
		TreeNode l = lowestCommonAncestor(root.left, p, q);
		TreeNode r = lowestCommonAncestor(root.right, p, q);

		if (l != null && r != null) {
			// 左树也搜到，右树也搜到，返回root
			return root;
		}
		if (l == null && r == null) {
			return null;
		}

		// l和r一个为空，一个不为空
		// 返回不空的那个
		return l != null ? l : r;

	}
}

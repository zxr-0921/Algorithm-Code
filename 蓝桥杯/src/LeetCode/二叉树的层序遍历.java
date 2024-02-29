package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class 二叉树的层序遍历 {

	public static List<List<Integer>> levelOrder1(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root != null) {
			Queue<TreeNode> q = new LinkedList<>();
			Map<TreeNode, Integer> m = new HashMap<>();
			q.add(root);
			m.put(root, 0);
			while (q != null) {
				TreeNode cur = q.poll();
				int level = m.get(cur);
				if (ans.size() == level) {
					ans.add(new ArrayList<>());
				}
				ans.get(level).add(cur.val);
				if (cur.left != null) {
					q.add(cur.left);
					m.put(cur.left, level + 1);
				}
				if (cur.right != null) {
					q.add(cur.right);
					m.put(cur.right, level + 1);
				}
			}

		}
		return ans;

	}
	
	public static List<List<Integer>> levelOrder2(TreeNode root) {
		return null;
		
	}

}

package 洛谷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import 洛谷.二叉树的遍历.TreeNode;

public class 二叉树的遍历 {
	// 二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer in = new StreamTokenizer(reader);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int left;
		int right;
		int n;
		Map<Integer, TreeNode> hs = new HashMap<Integer, TreeNode>();
		TreeNode cur = null;
		TreeNode tr = null;
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			for (int i = 1; i <= n; i++) {
				if (i == 1) {
					tr = new TreeNode(1);
					hs.put(1, tr);
				}
				if (hs.containsKey(i)) {
					cur = hs.get(i);
				} else {
					cur = new TreeNode(i);
					hs.put(i, cur);
				}
				in.nextToken();
				left = (int) in.nval;
				in.nextToken();
				right = (int) in.nval;
				if (left != 0) {
					cur.left = new TreeNode(left);
					hs.put(left, new TreeNode(left));
				}
				if (right != 0) {
					cur.right = new TreeNode(right);
					hs.put(right, new TreeNode(right));
				}

			}
			preOrder(tr);
		}

		out.close();
		reader.close();
	}

	// 先序打印所有节点，递归版
	public static void preOrder(TreeNode head) {
		if (head == null) {
			return;
		}
		System.out.print(head.val + " ");
		preOrder(head.left);
		preOrder(head.right);
	}

	// 中序打印所有节点，递归版
	public static void inOrder(TreeNode head) {
		if (head == null) {
			return;
		}
		inOrder(head.left);
		System.out.print(head.val + " ");
		inOrder(head.right);
	}

	// 后序打印所有节点，递归版
	public static void posOrder(TreeNode head) {
		if (head == null) {
			return;
		}
		posOrder(head.left);
		posOrder(head.right);
		System.out.print(head.val + " ");
	}

}

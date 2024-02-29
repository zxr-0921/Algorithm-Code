package 洛谷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import 洛谷.二叉树遍历1.TreeNode;

public class 二叉树遍历1 {
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
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int left;
		int right;
		int n;
		Map<Integer, TreeNode> hs = new HashMap<Integer, TreeNode>();
		TreeNode cur = null;
		TreeNode tr = null;
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) in.nval;
			for (int i = 1; i <= n; i++) {
				hs.put(i, new TreeNode(i));
			}
			for (int i = 1; i <= n; i++) {
				cur = hs.get(i);
				in.nextToken();
				left = (int) in.nval;
				in.nextToken();
				right = (int) in.nval;
				if (left != 0) {
					cur.left = hs.get(left);
				}
				if (right != 0) {
					cur.right = hs.get(right);
				}

			}
			preOrder(hs.get(1));
			inOrder(hs.get(1));
			posOrder(hs.get(1));
		}

//		out.close();
		reader.close();
	}

	// 先序打印所有节点，递归版
	/*
	 * public static void preOrder(TreeNode head) { if (head == null) { return; }
	 * System.out.print(head.val + " "); preOrder(head.left); preOrder(head.right);
	 * }
	 */

	// 中序打印所有节点，递归版
	/*
	 * public static void inOrder(TreeNode head) { if (head == null) { return; }
	 * inOrder(head.left); System.out.print(head.val + " "); inOrder(head.right); }
	 */

	// 后序打印所有节点，递归版
	/*
	 * public static void posOrder(TreeNode head) { if (head == null) { return; }
	 * posOrder(head.left); posOrder(head.right); System.out.print(head.val + " ");
	 * }
	 */
	// 迭代
	public static void preOrder(TreeNode head) {
		if (head != null) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			// 头结点进栈
			stack.push(head);
			// 当栈不为空
			// 1.栈顶出栈，打印
			// 2.右左节点不为空则进栈
			while (!stack.isEmpty()) {
				head = stack.pop();
				System.out.print(head.val + " ");
				if (head.right != null) {
					stack.push(head.right);
				}
				if (head.left != null) {
					stack.push(head.left);
				}
			}
		}
		System.out.println();

	}

	// 中序遍历
	public static void inOrder(TreeNode head) {
		if (head != null) {
			Stack<TreeNode> stack = new Stack();
			// 头结点不为空或者栈不为空
			while (!stack.isEmpty() || head != null) {
//				头结点不为空则进栈 目的是获取最右端的节点
				if (head != null) {
					stack.push(head);
					head = head.left;
				} else {
					// 如果为空，则出栈，并走右节点
					head = stack.pop();
					System.out.print(head.val + " ");
					head = head.right;
				}
			}
		}
		System.out.println();

	}

	// 后序遍历
	public static void posOrder(TreeNode h) {
		if (h != null) {
			Stack<TreeNode> stack = new Stack();
			stack.push(h);
			// 如果始终没有打印过节点，h就一直是头节点
			// 一旦打印过节点，h就变成打印节点
			// 之后h的含义 : 上一次打印的节点
			while (!stack.isEmpty()) {
				// 看一下的栈顶节点
				TreeNode cur = stack.peek();
				if (cur.left != null && h != cur.left && h != cur.right) {
					stack.push(cur.left);
				} else if (cur.right != null && h != cur.right) {
					stack.push(cur.right);
				} else {
					System.out.print(cur.val + " ");
					h = stack.pop();
				}
			}
		}
		System.out.println();
	}

}

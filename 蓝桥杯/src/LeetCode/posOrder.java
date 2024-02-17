package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class posOrder {

	// 两个栈实现
	public List<Integer> postorderTraversal(TreeNode root) {
		// 两个栈实现 入栈顺序右左中 出栈顺序是左右中
		List<Integer> list = new ArrayList<Integer>();
		if (root != null) {
			Stack<TreeNode> st = new Stack<TreeNode>();
			Stack<TreeNode> collect = new Stack<TreeNode>();
			// 先把头结点进栈
			st.push(root);
			while (!st.isEmpty()) {
				// 出栈便进栈
				root = st.pop();
				collect.push(root);
				if (root.left != null) {
					st.push(root.left);
				}
				if (root.right != null) {
					st.push(root.right);
				}
			}
			while (!collect.isEmpty()) {
				list.add(collect.pop().val);
			}
		}
		return list;
	}
	
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            Stack<TreeNode> st = new Stack<TreeNode>();
            st.push(root);
            while (!st.isEmpty()) {
                // 获取栈中的第一个元素
                TreeNode cur = st.peek();
                // 判断左子树是否遍历
                if (cur.left != null && root != cur.left && root != cur.right) {
                    st.push(cur.left);
                    // 判断右子树是否遍历
                } else if (cur.right != null && root != cur.right) {
                    st.push(cur.right);
                } else {
                    list.add(cur.val);
                    root = st.pop();
                }
            }
        }
        return list;

    }
}

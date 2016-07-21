import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	/**
	 * @param root:
	 *            The root of binary tree.
	 * @return: Preorder in ArrayList which contains node values.
	 */
	public ArrayList<Integer> firstpreorderTraversal(TreeNode root) {
		// write your code here

		ArrayList<Integer> order = new ArrayList<Integer>();
		if (root == null) {
			return order;
		}
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode temp = s.pop();
			order.add(temp.val);
			if (temp.right != null) {
				s.push(temp.right);
			}
			if (temp.left != null) {
				s.push(temp.left);
			}
		}
		return order;
	}
	public ArrayList<Integer> secondpreorderTraversal(TreeNode root) {
		// write your code here
		ArrayList<Integer> order = new ArrayList<Integer>();
		if (root == null) {
			return order;
		} else {
			order.add(root.val);
		}
		if (root.left != null) {
			order.addAll(secondpreorderTraversal(root.left));
		}
		if (root.right != null) {
			order.addAll(secondpreorderTraversal(root.right));
		}
		return order;
	}
}

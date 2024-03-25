package leetcode.solution.num;

import java.util.ArrayList;
import java.util.List;

public class P_94_BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		TreeNode tree = new TreeNode(1);
		P_94_BinaryTreeInorderTraversal solution = new P_94_BinaryTreeInorderTraversal();
		List<Integer> inorder = solution.inorderTraversal(root);
		System.out.println("Inorder Traversal: " + inorder);
	}

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		inorderTraversalRecursive(root, result);
		return result;
	}

	private void inorderTraversalRecursive(TreeNode node, List<Integer> result) {
		if (node == null) {
			return;
		}
		// left
		inorderTraversalRecursive(node.left, result);
		// add now
		result.add(node.val);
		// right
		inorderTraversalRecursive(node.right, result);
	}

	public static class TreeNode {

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

}

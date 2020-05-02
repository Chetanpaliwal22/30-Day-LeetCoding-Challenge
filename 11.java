/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
	int diameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 0;
		}

		traverse(root);
		return diameter - 1;
	}

	public int traverse(TreeNode node) {
		if (node == null)
			return 0;
		int left = traverse(node.left);
		int right = traverse(node.right);
		diameter = Math.max(diameter, left + right + 1);
		return Math.max(left, right) + 1;
	}

}

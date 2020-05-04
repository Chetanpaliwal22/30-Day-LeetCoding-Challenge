/*
 * Input: [1,2,3]
 * Output: 6
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
	Integer maxsum = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		maxsum(root);
		return maxsum;
	}

	public int maxsum(TreeNode node) {

		if (node == null) {
			return 0;
		}
		int left = 0;
		if (node.left != null) {
			left = maxsum(node.left);
		}
		int nodeVal = node.val;
		int right = 0;
		if (node.right != null) {
			right = maxsum(node.right);
		}
		int totalSum = Math.max(nodeVal, Math.max(nodeVal + left + right, Math.max(nodeVal + left, nodeVal + right)));
		maxsum = Math.max(maxsum, totalSum);

		return Math.max(nodeVal, Math.max(nodeVal + left, nodeVal + right));
	}
}

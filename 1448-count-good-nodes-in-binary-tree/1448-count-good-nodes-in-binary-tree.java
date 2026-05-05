/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        //if (root == null) return 0;
        return helper_dfs_recursion(root, root.val);
    }

    private int helper_dfs_recursion(TreeNode node, int maxValue){
        if (node == null) return 0;
        int res = node.val >= maxValue ? 1 : 0;
        res += helper_dfs_recursion(node.left, Math.max(node.val, maxValue));
        res += helper_dfs_recursion(node.right, Math.max(node.val, maxValue));
        return res;
    }
}
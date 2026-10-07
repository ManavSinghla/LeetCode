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
    int fun(TreeNode root){
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null) return root.left.val+fun(root.right);
        return fun(root.left)+fun(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root);
    }
}
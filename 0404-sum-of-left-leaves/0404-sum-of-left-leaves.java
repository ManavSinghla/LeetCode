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
    void fun(int[] a,TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null) a[0]+=root.left.val;
        fun(a,root.left);
        fun(a,root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int[] a={0};
        fun(a,root);
        return a[0];
    }
}
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
    int fun(int[] ans,TreeNode root){
        if(root==null) return 0;
        int left =fun(ans,root.left);
        int right =fun(ans,root.right);
        ans[0]=Math.max(ans[0],left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans={0};
        fun(ans,root);
        return ans[0];
    }
}
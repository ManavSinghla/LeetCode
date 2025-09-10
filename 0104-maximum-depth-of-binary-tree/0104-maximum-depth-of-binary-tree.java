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
    void fun(int[] ans,int temp, TreeNode root){
        if(root==null) return;
        temp++;
        ans[0]=Math.max(temp,ans[0]);
        fun(ans,temp,root.left);
        fun(ans,temp,root.right);
    }
    public int maxDepth(TreeNode root) {
        int[] ans={0};
        fun(ans,0,root);
        return ans[0];
    }
}
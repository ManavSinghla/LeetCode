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
    void fun(int[] ans,int temp,TreeNode root){
        if(root==null) return;
        temp++;
        if(root.left==null && root.right==null) ans[0]=Math.min(ans[0],temp);
        fun(ans,temp,root.left);
        fun(ans,temp,root.right);
    }

    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int[] ans={10000};
        fun(ans,0,root);
        return ans[0];
    }
}
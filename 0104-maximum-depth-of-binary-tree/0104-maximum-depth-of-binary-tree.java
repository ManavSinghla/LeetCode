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
    void fun(int[] ans,int c,TreeNode root){
        if(root==null) return;
        c++;
        if(ans[0]<c){
            ans[0]=c;
        }
        fun(ans,c,root.left);
        fun(ans,c,root.right);
    }
    public int maxDepth(TreeNode root) {
        int[] ans=new int[1];
        fun(ans,0,root);
        return ans[0];
    }
}
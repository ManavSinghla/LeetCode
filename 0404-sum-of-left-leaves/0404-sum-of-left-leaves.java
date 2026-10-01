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
        int ans=0;
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null) ans+=root.left.val;
        else ans+=fun(root.left);
        ans+=fun(root.right);
        return ans;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root);
    }
}
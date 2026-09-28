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
    int fun(int temp,TreeNode root){
        if(root==null) return 0;
        temp=temp*10+root.val;
        if(root.left==null && root.right==null) return temp;
        return fun(temp,root.left) + fun(temp,root.right);
    }
    public int sumNumbers(TreeNode root) {
        return fun(0,root);
    }
}
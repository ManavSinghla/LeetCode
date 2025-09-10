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
    boolean isLeaf(TreeNode root){
        return root.left==null && root.right==null;
    }
    boolean fun(TreeNode root,int targetSum,int sum){
        if(root==null) return false;
        sum=sum+root.val;
        if(isLeaf(root) && sum==targetSum){
            return true;
        }
        return fun(root.left,targetSum,sum) || fun(root.right,targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root,targetSum,0);
    }
}
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
    void fun(Long sum, int[] ans, TreeNode root,int k){
        if(root==null) return;
        sum+=root.val;
        if(sum==k) ans[0]++;
        fun(sum,ans,root.left,k);
        fun(sum,ans,root.right,k);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int[] ans={0};
        fun(0L,ans,root,targetSum);
        return ans[0]+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
}
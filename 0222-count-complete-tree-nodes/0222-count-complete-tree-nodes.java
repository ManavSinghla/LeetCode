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
    void fun(List<Integer> ans,TreeNode root){
        if(root==null){
            return;
        }
        ans.add(root.val);
        fun(ans,root.left);
        fun(ans,root.right);
    }
    public int countNodes(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        fun(ans,root);
        int c=ans.size();
        return c;
    }
}
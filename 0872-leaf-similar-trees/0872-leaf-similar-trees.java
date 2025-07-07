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
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(root.val);
        }
        fun(ans,root.left);
        fun(ans,root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        fun(ans1,root1);
        fun(ans2,root2);
        return ans1.equals(ans2);
    }
}
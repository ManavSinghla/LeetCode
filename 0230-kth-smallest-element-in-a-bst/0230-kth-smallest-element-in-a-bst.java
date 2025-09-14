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
    void fun(TreeNode root,List<Integer> ans){
        if(root==null) return;
        fun(root.left,ans);
        ans.add(root.val);
        fun(root.right,ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans=new ArrayList<>();
        fun(root,ans);
        return ans.get(k-1);
    }
}
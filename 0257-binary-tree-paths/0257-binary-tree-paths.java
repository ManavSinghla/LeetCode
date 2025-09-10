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

    void fun(List<String> ans ,String temp,TreeNode root){
        if(root==null) return;
        temp=temp+root.val;
        if(isLeaf(root)){
            ans.add(temp);
        }
        fun(ans,temp+"->",root.left);
        fun(ans,temp+"->",root.right);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        String temp="";
        fun(ans,temp,root);
        return ans;
    }
}
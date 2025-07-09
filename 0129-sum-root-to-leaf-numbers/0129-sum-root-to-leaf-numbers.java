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

    void fun(ArrayList<Integer> ans,int temp,TreeNode root){
        if(root==null) return;
        temp=(temp*10)+root.val;
        if(isLeaf(root)){
            ans.add(temp);
        }
        fun(ans,temp,root.left);
        fun(ans,temp,root.right);
    }

    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        fun(ans,0,root);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        return sum;
    }
}
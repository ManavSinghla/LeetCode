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
    void fun(String[] ans,String temp,TreeNode root){
        if(root==null) return;
        int b=(int) 'a';
        char a=(char) (b+root.val);
        temp+=a;
        if(root.left==null && root.right==null){
            StringBuilder c=new StringBuilder(temp);
            String d=c.reverse().toString();
            if(ans[0].equals("") || ans[0].compareTo(d)>0){
                ans[0]=d;
            }
        }
        fun(ans,temp,root.left);
        fun(ans,temp,root.right);
    }
    public String smallestFromLeaf(TreeNode root) {
        String[] ans={""};
        fun(ans,"",root);
        return ans[0];
    }
}
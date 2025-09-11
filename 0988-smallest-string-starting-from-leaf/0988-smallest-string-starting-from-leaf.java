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
    void fun(String[] ans, String temp, TreeNode root) {
    if (root == null) return;
    temp = (char)(root.val + 'a') + temp;
    if (root.left == null && root.right == null) {
        if(ans[0].equals("") || ans[0].compareTo(temp)>0){
            ans[0]=temp;
        }
        return;
    }
    fun(ans, temp, root.left);
    fun(ans, temp, root.right);
}

    public String smallestFromLeaf(TreeNode root) {
        String[] ans={""};
        fun(ans,"",root);
        return ans[0];
    }
}
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
    void fun(List<String> ans, String temp, TreeNode root) {
    if (root == null) return;
    temp = (char)(root.val + 'a') + temp;  // prepend instead of append
    if (root.left == null && root.right == null) {
        ans.add(temp);
        return;
    }
    fun(ans, temp, root.left);
    fun(ans, temp, root.right);
}

    public String smallestFromLeaf(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        String temp="";
        fun(ans,temp,root);
        String finalAns=ans.get(0);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i).compareTo(finalAns) <0 ){
                finalAns=ans.get(i);
            }
        }
        return finalAns;
    }
}
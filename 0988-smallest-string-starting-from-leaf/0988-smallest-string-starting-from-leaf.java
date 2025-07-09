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
    void fun(ArrayList<String> ans,StringBuilder temp, TreeNode root){
        if(root==null) return;
        char a=(char) (root.val+97);
        temp=temp.append(a);
        if(root.left==null && root.right==null){
            temp.reverse();
            ans.add(temp.toString());
            temp.reverse();
        }
        fun(ans,temp,root.left);
        fun(ans,temp,root.right);
        temp.deleteCharAt(temp.length() - 1);
    }
    public String smallestFromLeaf(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder temp=new StringBuilder();
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
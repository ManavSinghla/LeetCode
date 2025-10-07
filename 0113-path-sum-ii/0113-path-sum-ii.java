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
    void fun(List<List<Integer>> ans,List<Integer> temp,TreeNode root,int tsum,int sum){
        if(root==null) return;
        sum+=root.val;
        temp.add(root.val);
        if(root.left==null && root.right==null && tsum==sum){
            ans.add(new ArrayList<>(temp));
        }
        fun(ans,temp,root.left,tsum,sum);
        fun(ans,temp,root.right,tsum,sum);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,root,targetSum,0);
        return ans;
    }
}
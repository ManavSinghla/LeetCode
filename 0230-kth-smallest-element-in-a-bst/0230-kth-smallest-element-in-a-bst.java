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
    void fun(List<Integer> nums,TreeNode root){
        if(root==null) return;
        fun(nums,root.left);
        nums.add(root.val);
        fun(nums,root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> nums=new ArrayList<>();
        fun(nums,root);
        return nums.get(k-1);
    }
}
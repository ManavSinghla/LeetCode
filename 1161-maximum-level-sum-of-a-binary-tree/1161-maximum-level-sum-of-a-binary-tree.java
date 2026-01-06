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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        int lvl=0;
        int temp1=0;
        while(!q.isEmpty()){
            int size=q.size();
            int temp=0;
            for(int i=0;i<size;i++){
                TreeNode a=q.poll();
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);
                temp+=a.val;
            }
            temp1++;
            if(ans<temp) lvl=temp1;
            ans=Math.max(temp,ans);
        }
        return lvl;
    }
}
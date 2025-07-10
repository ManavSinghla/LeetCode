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
    void func(TreeNode root,List<List<Integer>> re){
        if(root==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            re.add(currentLevel);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> re = new ArrayList<>();
        func(root, re);
        return re;
    }
}
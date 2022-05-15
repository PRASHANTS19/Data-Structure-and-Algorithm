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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)return -1;
        if(root.left==null && root.right==null)return root.val;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int res = -1;
        while(q.isEmpty()!=true){
            int ans=0;
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                ans += temp.val;
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            res = ans;
        }
        return res;
    }
}
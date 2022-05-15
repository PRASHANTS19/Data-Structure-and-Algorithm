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
    int res = 0;
    public int deepestLeavesSum(TreeNode root) {
        int level = height(root);
        
        solve(root,1,level);
        
        // System.out.print(level);
        
        return res;
        
    }
    void solve(TreeNode root,int height,int level){
        if(root==null)return;
        
        if(root.left==null && root.right==null && height==level){
            res += root.val;
            return;
        }
        solve(root.left,height+1,level);
        solve(root.right,height+1,level);
        
    }
    int height(TreeNode root){
        if(root==null)return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.max(left,right)+1;
    }
}
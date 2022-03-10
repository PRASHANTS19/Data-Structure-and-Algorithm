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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        boolean res[] = new boolean[1];
        res[0] = true;
        
        solve(root,res);
        return res[0];
        
        
    }
    int solve(TreeNode root,boolean res[]){
        if(root==null)return 0;
        
        int x = 1+solve(root.left,res);
        int y = 1+solve(root.right,res);
        
        if(Math.abs(x-y)>1){
            res[0] = false;
            return 0;
        }
        return Math.max(x,y);
        
    }
}
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
    int res = (int)1e9;
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        solve(root,0);
        return res;
    }
    void solve(TreeNode root,int height){
        if(root==null)return;
        
        if(root.left==null && root.right==null){
            res = Math.min(res,height+1);
            return;
        }
        
        solve(root.left,height+1);
        solve(root.right,height+1);
        
       
    }
    
}
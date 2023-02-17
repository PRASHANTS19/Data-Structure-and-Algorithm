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
    int ans= (int)1e9;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        
        solve(root);
        return ans;
            
            
    }
    void solve(TreeNode root){
        if(root==null)return;
           
        solve(root.left);
        if(prev!=null)
            ans = Math.min(ans,Math.abs(prev-root.val));
        
        prev = root.val;

        solve(root.right);
        
    }
}
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
    int ans = -(int)1e9;
    public int maxAncestorDiff(TreeNode root) {
        
        solve(root.left,root.val,root.val);
        solve(root.right,root.val,root.val);
        
        return ans;
        
    }
    void solve(TreeNode root,int max,int min){
        if(root==null)return;
        
        int temp = Math.max(Math.abs(max-root.val),Math.abs(min-root.val));
        ans = Math.max(temp,ans);
        
        solve(root.left,Math.max(max,root.val),Math.min(min,root.val));
        solve(root.right,Math.max(max,root.val),Math.min(min,root.val));
        
    }
}
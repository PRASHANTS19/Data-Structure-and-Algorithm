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
    public int maxAncestorDiff(TreeNode root) {
        
        return dfs(root,root.val,root.val);
    }
    int dfs(TreeNode node ,int mn , int mx){
        if(node == null)return mx-mn;
        
        mx = Math.max(node.val,mx);
        mn = Math.min(node.val,mn);
        
        return Math.max(dfs(node.left,mn,mx),dfs(node.right,mn,mx));
    }
}
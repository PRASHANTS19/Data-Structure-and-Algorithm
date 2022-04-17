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
    TreeNode child = new TreeNode(-1);
    public TreeNode increasingBST(TreeNode root) {
        
        TreeNode temp = child;
        solve(root);
        
        return temp.right;
    }
    void solve(TreeNode root){
        if(root==null)return;
        
        solve(root.left);
        
        child.right =  new TreeNode(root.val);
        child = child.right;
        
        solve(root.right);
    }
}
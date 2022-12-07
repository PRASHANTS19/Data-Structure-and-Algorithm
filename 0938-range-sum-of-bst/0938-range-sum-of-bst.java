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
    public int rangeSumBST(TreeNode root, int low, int high) {
        solve(root,low,high);
        
        return sum;
    }
    int sum = 0;
    void solve(TreeNode root, int low, int high){
        if(root==null)return;
        
        if(root.val>=low && root.val<=high)sum += root.val;
        
        solve(root.left,low,high);
        solve(root.right,low,high);

    }
}
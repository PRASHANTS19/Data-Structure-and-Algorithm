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
    static int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        return solve(root,root.val);

    }
    int solve(TreeNode root,int max){
        if(root==null)return 0;
        
        int l = solve(root.left,Math.max(max,root.val));
        int r = solve(root.right,Math.max(max,root.val));
        
        if(root.val>=max)return 1+l+r;
        return l+r;
        
    }
}
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
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null)return root.val;
        int res[] = new int[1];
        res[0] = Integer.MIN_VALUE;
        solve(root,res);
        
        return res[0];
    }
    int solve(TreeNode root,int[] res){
        if(root==null)return 0;
        
        int left = Math.max(0,solve(root.left,res));
        int right = Math.max(0,solve(root.right,res));
        
        res[0] = Math.max(res[0],left+right+root.val);
        
        return Math.max(left,right)+root.val;
    }
}
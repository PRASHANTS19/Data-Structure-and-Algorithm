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
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        solve(root,0,targetSum);
        return res;
    }
    int solve(TreeNode root,int sum,int target){
        if(root==null)return 0;
        if(root.left==null && root.right==null){
            if(sum+root.val == target){
                res = true;
                return 0;
            }
        }
        
        int left = solve(root.left,sum+root.val,target);
        int right = solve(root.right,sum+root.val,target);
        
        return left+right;
    }
}
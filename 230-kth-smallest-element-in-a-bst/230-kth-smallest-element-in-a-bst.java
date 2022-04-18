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
    int n=0;
    public int kthSmallest(TreeNode root, int k) {
        
        int res[] = {-1};
        solve(root,res,k);
        return res[0];
        
    }
    void solve(TreeNode root,int res[],int k){
        if(root==null)return;
        
        
        solve(root.left,res,k);
        n++;
        if(n==k){
            res[0] = root.val;
            return;
        }
        solve(root.right,res,k);
    }
}
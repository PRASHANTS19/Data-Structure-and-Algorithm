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
    static int res = -1;
    static int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        solve(root);
        return res;
    }
    void solve(TreeNode root){
        if(root==null)return;
        
        solve(root.left);
        count--;
        if(count==0){
            res = root.val;
            return;
        }
        solve(root.right);
       
    }
}
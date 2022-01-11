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
    int ans;
    public int sumRootToLeaf(TreeNode root) {
        int res[] = new int[1];
        solve(root,0,res);
        return res[0];
    }
    void solve(TreeNode root,int val,int[] sum){
        if(root== null){
            return;
        }
        val = val<<1|root.val;
        if(root.left == null && root.right == null) sum[0] += val;
        solve(root.left,val,sum);
        solve(root.right,val,sum);
    }
}
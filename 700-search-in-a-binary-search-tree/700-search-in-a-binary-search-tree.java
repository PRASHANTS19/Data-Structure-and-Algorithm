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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val == val)return root;
        
        return solve(root,val);
    }
    TreeNode solve(TreeNode root, int val){
        if(root==null)return null;
        
        if(root.val==val)return root;
        
        TreeNode left=null;
        TreeNode right=null;
        if(root.val>val)
            left = solve(root.left,val);
        if(root.val<val)
            right = solve(root.right,val);
        
        if(left!=null)return left;
        return right;
        
    }
    
}
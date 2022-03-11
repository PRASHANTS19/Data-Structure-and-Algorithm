/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        TreeNode res = new TreeNode(-1);
        return solve(root,p,q);
    }
    TreeNode solve(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root==p || root==q)return root;
        
        //if(root.val==p.val || root.val==q.val)return root;
                
        TreeNode left = solve(root.left,p,q);
        TreeNode right = solve(root.right,p,q);
        
        if(left==null)return right;
        else if(right==null)return left;
        return root;
    }
}
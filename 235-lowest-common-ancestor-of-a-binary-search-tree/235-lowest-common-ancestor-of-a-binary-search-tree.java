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
//         if(root==null || root==p || root==q)return root;
        
//         TreeNode left = lowestCommonAncestor(root.left,p,q);
//         TreeNode right = null;
//         if(left!=null && )
//         TreeNode right = lowestCommonAncestor(root.right,p,q);
        
//         if(left==null)return right;
//         else if(right==null)return left;
//         return root;
        
        return solve( root,  p,  q);
    }    
    TreeNode solve(TreeNode root, TreeNode p, TreeNode q){
        if(root.val>p.val && root.val>q.val){
            return solve(root.left,p,q);
        }
        else if(root.val<p.val && root.val<q.val){
            return solve(root.right,p,q);
        }
        return root;
    }
}
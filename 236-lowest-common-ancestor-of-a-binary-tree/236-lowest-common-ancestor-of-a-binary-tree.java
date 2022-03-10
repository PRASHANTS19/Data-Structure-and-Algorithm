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
        if(root==null)return null;
        
        if(root.val==p.val || root.val==q.val)return root;
                
        TreeNode x = solve(root.left,p,q);
        TreeNode y = solve(root.right,p,q);
        
       if(x==null && y==null)return null;
       else if(x!=null && y!=null)return root;
       else if(x==null)return y;
        return x;
    }
}
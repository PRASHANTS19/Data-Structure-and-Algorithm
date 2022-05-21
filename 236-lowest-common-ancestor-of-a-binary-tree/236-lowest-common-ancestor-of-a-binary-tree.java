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
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        res = null;
        solve(root,p, q);
        return res;
    }
    boolean solve(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)return false;
        if(res!=null)return true;
        
        boolean left = solve(root.left,p,q);
        boolean right = solve(root.right,p,q);
        
        if((root==p||root==q)&&(left==true||right==true)){
             if(res==null){
                res = root;
            }
        }
        
        if(root==p || root==q)return true;
        if(left==true && right==true){
            if(res==null){
                res = root;
            }
        }
        return left||right;
    }
}
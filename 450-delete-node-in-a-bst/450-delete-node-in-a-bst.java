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
    public TreeNode deleteNode(TreeNode root, int x) {
        return solve(root,x);
        
    }
    TreeNode solve(TreeNode root, int x){
        if(root == null)return null;
        
        if(root.val<x)root.right = solve(root.right,x);
        else if(root.val>x)root.left = solve(root.left,x);
        else{
            if(root.left==null)return root.right;
            else if(root.right==null)return root.left;
            else{
                TreeNode min = getmin(root);
                root.val = min.val;
                root.right = solve(root.right,min.val);
            }
        }
        return root;
    }
     TreeNode getmin(TreeNode node){
        node = node.right;
        while(node!=null && node.left!=null)node=node.left;
        
        return node;
    }
    
}
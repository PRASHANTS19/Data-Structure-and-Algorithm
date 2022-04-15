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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)return root;
        
         if(root.val<low){
            // root = root.right;
            return trimBST(root.right,low,high);
        }
         if(root.val>high){
            // root=root.left;
            return trimBST(root.left,low,high);
        }
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
        
    }
    void solve(TreeNode root,TreeNode parent, int low, int high){
        if(root==null)return;
        
        
        if(root.val==low){
            root.left = null;
        }
        else if(root.val<low){
            if(parent.left==root)
                parent.left=root.right;
            else parent.right=root.right;
        }
        else if(root.val==high){
            root.right=null;
        }
        else if(root.val>high){
            if(parent.right==root)
                parent.right=root.left;
            else 
                parent.left=root.left;
        }
        parent = root;
        solve(root.left,parent,low,high);
        solve(root.right,parent,low,high);
        
    }
}
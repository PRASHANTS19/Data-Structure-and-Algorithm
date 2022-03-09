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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int dia[] = new int[1];
        
        height(root,dia);
        return dia[0];
    }
    int height(TreeNode root,int dia[]){
        if(root==null)return 0;
        
        int left = height(root.left,dia);
        int right =height(root.right,dia);
        
        dia[0] = Math.max(left+right,dia[0]);
        return 1+Math.max(left,right);
    }
}
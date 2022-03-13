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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        HashMap<Integer,Integer> inmap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inmap.put(inorder[i],i);
        }
        return solve(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inmap);
    }
    TreeNode solve(int preorder[],int prestart,int preend,int inorder[],int instart,int inend,HashMap<Integer,Integer> inmap){
        if(instart>inend || prestart>preend)return null;
        
        TreeNode root = new TreeNode(preorder[prestart]);
        int inindex = inmap.get(preorder[prestart]);
        int remain = inindex-instart;
        
        root.left = solve(preorder,prestart+1,preend+remain,inorder,instart,inindex-1,inmap);
        root.right = solve(preorder,prestart+remain+1,preend,inorder,inindex+1,inend,inmap);
        
        return root;
    }
}
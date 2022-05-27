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
        int n = preorder.length;
        
        for(int i=0; i<n; i++){
            inmap.put(inorder[i],i);
        }
        
        return solve(preorder,0,n-1,inorder,0,n-1,inmap);
        
    }
    TreeNode solve(int[]pre,int prestart,int preend,int[]in,int instart,int inend,HashMap<Integer,Integer> inmap){
        if(prestart>preend||instart>inend)return null;
        
        TreeNode root = new TreeNode(pre[prestart]);
        int in_index =inmap.get(pre[prestart]);
        int numleft = in_index-instart;
        
        root.left = solve(pre,prestart+1,prestart+numleft,in,instart,in_index-1,inmap);
        root.right = solve(pre,prestart+numleft+1,preend,in,in_index+1,inend,inmap);
        
        return root;
    }
}
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> inmap = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++){
            inmap.put(inorder[i],i);
        }
        int n=inorder.length;
        return buildtree(postorder,n-1,0,inorder,0,n-1,inmap);
        
    }
    TreeNode buildtree(int[]po,int poststart,int postend,int[]in,int instart,int inend,HashMap<Integer,Integer>inmap){
        if(postend>poststart || instart>inend)return null;
        
        TreeNode root = new TreeNode(po[poststart]);
        int inroot = inmap.get(root.val);
        int numleft = inend-inroot;
        
        root.right = buildtree(po,poststart-1,poststart-numleft,in,inroot+1,inend,inmap);
        root.left = buildtree(po,poststart-numleft-1,postend,in,instart,inroot-1,inmap);
        
        return root;
        
    }
}
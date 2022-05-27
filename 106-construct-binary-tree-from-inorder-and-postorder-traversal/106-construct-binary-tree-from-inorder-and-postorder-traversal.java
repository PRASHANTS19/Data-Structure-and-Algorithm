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
        return solve(postorder,0,postorder.length-1,inorder,0,inorder.length-1,inmap);
    }
    TreeNode solve(int[] post,int pstart,int pend,int[] in,int instart,int inend,HashMap<Integer,Integer>inmap){
      if(pstart>pend || instart>inend)return null;
        
        TreeNode root = new TreeNode(post[pend]);
        
        int in_index = inmap.get(post[pend]);
        int numleft = inend-in_index;
        
        root.right = solve(post,pend-numleft,pend-1,in,in_index+1,in_index+numleft,inmap);
        root.left = solve(post,pstart,pend-numleft-1,in,instart,in_index-1,inmap);
        
        
        return root;
        
    }
}






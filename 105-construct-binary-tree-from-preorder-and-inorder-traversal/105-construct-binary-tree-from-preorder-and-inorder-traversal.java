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
    TreeNode solve(int preorder[],int pstart,int pend,int inorder[],int istart,int iend,HashMap<Integer,Integer>inmap){
        if(istart>iend || pstart>pend)return null;
        
        TreeNode root = new TreeNode(preorder[pstart]);
        int in_index = inmap.get(root.val);
        int numleft = in_index-istart;
        
        root.left= solve(preorder,pstart+1,pstart+numleft,inorder,istart,in_index-1,inmap);
        root.right = solve(preorder,pstart+numleft+1,pend,inorder,in_index+1,iend,inmap);
        
        return root;
    }
}
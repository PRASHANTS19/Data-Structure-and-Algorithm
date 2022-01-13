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
    public TreeNode bstFromPreorder(int[] preorder) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<preorder.length; i++){
            A.add(preorder[i]);
        }
        TreeNode root = new TreeNode(A.get(0));
        for(int i=1; i<A.size(); i++){
            solve(root,A.get(i));
        }
        return root;
        
    }
    void solve(TreeNode node , int val){
        if(node==null)return;

        if(node.left==null){
            if(val<node.val){
                node.left = new TreeNode(val);
                return;
            }
        }
        if(node.right==null){
            if(val>node.val){
                node.right = new TreeNode(val);
                return;
            }
        }
        if(val<node.val){
            solve(node.left,val);
        }
        if(val>node.val){
            solve(node.right,val);
        }
    }        
}
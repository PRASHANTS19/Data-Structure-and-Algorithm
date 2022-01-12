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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)return new TreeNode(val);
        TreeNode node = new TreeNode(val);
        insert(root,node);
        return root;
    }
    void insert(TreeNode root, TreeNode node){
        if(root == null)return;
        if(root.left==null){
            if(root.val>node.val){
                root.left = node;
                return;
            }
        }
        if(root.right == null){
            if(root.val<node.val){
               root.right = node;
                return;
            }
        }
        if(node.val>root.val){
            insert(root.right,node);
        }
        if(node.val<root.val){
            insert(root.left,node);
        }
    }
}
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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true){
            int size = q.size();
            boolean xx=false, yy=false;
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                if(temp.val==x)xx=true;
                if(temp.val==y)yy=true;
                
                if(temp.left!=null && temp.right!=null){
                    if((temp.left.val==x&&temp.right.val==y)||(temp.left.val==y&&temp.right.val==x))return false;
                }
                if(xx==true && yy==true)return true;
                
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
        }
        return false;
    }
}
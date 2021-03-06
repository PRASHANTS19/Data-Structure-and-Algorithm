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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        // int n = height(root);
        List<List<Integer>> matrix = new LinkedList<>();
        if(root==null)return matrix;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                list.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            
            // System.out.println(list);
            matrix.add(0,list);
        }
        return matrix;
    }
}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> adj = new ArrayList<>();
        if(root==null)return adj;
        boolean flag = true;
        
        while(q.isEmpty()!=true){
            int s = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<s; i++){
                TreeNode temp = q.remove();
                list.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(flag==false){
                Collections.reverse(list);
            }
            adj.add(new ArrayList<>(list));
            flag = !flag;
        }
        return adj; 
    }
}
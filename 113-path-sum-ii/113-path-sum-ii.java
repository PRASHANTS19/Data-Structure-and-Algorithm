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
    List<List<Integer>> matrix;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        matrix = new ArrayList<>();
        
        solve(root,0,target,new ArrayList<>());
            return matrix;
    }
    void solve(TreeNode root,int sum,int target,List<Integer> list){
        if(root==null)return;
        if(root.left==null && root.right==null){
            if((sum+root.val)==target){
                list.add(root.val);
                matrix.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
            return;
        }
        
        list.add(root.val);
        solve(root.left,sum+root.val,target,list);
        solve(root.right,sum+root.val,target,list);
        list.remove(list.size()-1);
    }
}
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        solve(root1,list);
        solve(root2,list);
        Collections.sort(list);
        return list;
        
    }
     void solve(TreeNode root,List<Integer> list){
        if(root == null)return;
        solve(root.left,list);
        list.add(root.val);
        solve(root.right,list);
    }
}
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
    ArrayList<Integer> list;
    public int minDiffInBST(TreeNode root) {
        list = new ArrayList<>();
        
        int ans = (int)1e9;
        
        
        solve(root);
        for(int i=1; i<list.size(); i++){
            ans = Math.min(ans,Math.abs(list.get(i)-list.get(i-1)));
        }
        return ans;
            
            
    }
    void solve(TreeNode root){
        if(root==null)return;
        
       
        solve(root.left);
         list.add(root.val);
        
        solve(root.right);
        
    }
}
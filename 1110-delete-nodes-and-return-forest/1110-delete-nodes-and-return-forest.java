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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        List<TreeNode> list  = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x : to_delete){
            set.add(x);
        }
        solve(root,set,list, new TreeNode());
        
        if(!set.contains(root.val))list.add(0,root);
        
        return list;
    }
    void solve(TreeNode root, HashSet<Integer> set,List<TreeNode>list,TreeNode parent){
        if(root==null)return;
        
        solve(root.left,set,list,root);
        solve(root.right,set,list,root);
        if(set.contains(root.val)){
            if(root.right!=null)list.add(0,root.right);
            if(root.left!=null)list.add(0,root.left);
            
            if(parent.left==root)parent.left=null;
            if(parent.right==root)parent.right=null;
        }
    }
}
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
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<preorder.length; i++){
            list.add(preorder[i]);
        }
        return solve(list);
        
    }
    TreeNode solve(ArrayList<Integer> list){
        if(list.isEmpty())return null;
        int rootvalue = list.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i=1; i<list.size(); i++){
            if(list.get(i)<rootvalue){
                left.add(list.get(i));
            }
            else{
                right.add(list.get(i));
            }
        }
        TreeNode root = new TreeNode(rootvalue);
        root.left = solve(left);
        root.right = solve(right);
        return root;
    }
}
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
    int camera= 0;
    public int minCameraCover(TreeNode root) {
        if(root.left==null && root.right==null)return 1;
        if(solve(root)==-1)camera++;
        return camera;
    }
    //need cover = -1;
    //have cover = 0;
    //covered = 1;
    int solve(TreeNode root){
        if(root==null)return 1;
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        if(left==-1 || right==-1){
            camera++;
            return 0;
        }
        if(left==0 || right==0)return 1;
        if(left==1 && right==1)return -1;
        return -1;
     }
}
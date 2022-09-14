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
    public int pseudoPalindromicPaths (TreeNode root) {
        
        solve(root,new int[10]);
        return count;
    }
    int count=0;
    void solve(TreeNode root,int arr[]){
        if(root==null)return;
        arr[root.val]++;
        if(root.left==null && root.right==null){
            int odd=0;
            for(int i=1; i<10; i++){
                if(arr[i]%2!=0)odd++;
            }
            if(odd<=1)count++;
            arr[root.val]--;
            return;
        }
        solve(root.left,arr);
        solve(root.right,arr);
        arr[root.val]--;
    }
    
}
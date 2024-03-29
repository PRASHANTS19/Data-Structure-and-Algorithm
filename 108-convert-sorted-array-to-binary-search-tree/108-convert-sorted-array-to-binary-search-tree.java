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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        
        TreeNode head = solve(nums,0,nums.length-1);
        return head;
        
    }
    TreeNode solve(int arr[],int low,int high){
        if(low>high)return null;
        
        int mid = low +(high-low)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = solve(arr,low,mid-1);
        node.right = solve(arr,mid+1,high);
        
        return node;
        
    }
    
}
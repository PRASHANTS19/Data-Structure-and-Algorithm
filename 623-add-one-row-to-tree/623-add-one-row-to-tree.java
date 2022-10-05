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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
     
        if(depth==1){
            TreeNode head = new TreeNode(val);
            head.left=root;
            return head;
        }
        int d = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int i=0; i<s; i++){
                TreeNode temp = q.remove();
                if(d==depth-1){
                    if(temp.left!=null){
                        TreeNode t = temp.left;
                        temp.left=new TreeNode(val);
                        temp.left.left=t;
                    }
                    if(temp.right!=null){
                        TreeNode t = temp.right;
                        temp.right=new TreeNode(val);
                        temp.right.right=t;
                    }
                    if(temp.left==null){
                        temp.left=new TreeNode(val);
                    }
                    if(temp.right==null){
                        temp.right=new TreeNode(val);
                    }
                }
                else{
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
            }
            if(d==depth-1)break;
            d++;
        }
        return root;
    }
}
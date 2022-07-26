/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>ans = new ArrayList<>();
        if(k==0){
            ans.add(target.val);
            return ans;
        }

        
        HashMap<TreeNode,ArrayList<TreeNode>>map = new HashMap<>();
        solve(root,map,new TreeNode(-1));
        Queue<TreeNode>q = new LinkedList<>();
        HashSet<TreeNode>set = new HashSet<>();
        
        q.add(target);
        set.add(target);
        int count = 1;
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int i=0; i<s; i++){
               ArrayList<TreeNode>temp = map.get(q.remove());
                
                for(TreeNode x : temp){
                    if(set.add(x)==true){
                        q.add(x);
                    }
                }
            }
            if(count==k)break;
            count++;
        }
        
        while(q.isEmpty()!=true){
            ans.add(q.remove().val);
        }
        return ans;
    }
    void solve(TreeNode root,HashMap<TreeNode,ArrayList<TreeNode>>map,TreeNode parent){
        if(root==null)return;
        
        if(map.containsKey(root)==false)
            map.put(root,new ArrayList<>());
        if(parent.val!=-1)
            map.get(root).add(parent);
        if(root.left!=null)
            map.get(root).add(root.left);
        if(root.right!=null)
            map.get(root).add(root.right);
        
        solve(root.left,map,root);
        solve(root.right,map,root);
        
        
    }
}
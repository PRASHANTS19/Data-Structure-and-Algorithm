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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> matrix = new ArrayList<>();
        TreeMap<Integer,ArrayList<Integer>> m = new TreeMap<>();
        
        Queue<pair> q = new LinkedList<>();
        
        q.add(new pair(0,root));
        while(q.isEmpty()!=true){
            int size=q.size();
            TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
            
            for(int i=0; i<size; i++){
                pair temp = q.remove();
                ArrayList<Integer>list = new ArrayList<>();
                if(map.containsKey(temp.key)){
                   list = map.get(temp.key);
                    list.add(temp.node.val);
                    map.put(temp.key,list);
                }
                else{
                    list.add(temp.node.val);
                    map.put(temp.key,list);
                }
                if(temp.node.left!=null)q.add(new pair(temp.key-1,temp.node.left));
                if(temp.node.right!=null)q.add(new pair(temp.key+1,temp.node.right));         
            }
           for(Map.Entry<Integer,ArrayList<Integer>>entry : map.entrySet()){
               if(m.containsKey(entry.getKey())){
                   ArrayList<Integer>sortl = entry.getValue();
                   Collections.sort(sortl);
                   m.get(entry.getKey()).addAll(sortl);
               }
               else {
                   ArrayList<Integer>sortl = entry.getValue();
                   Collections.sort(sortl);
                   m.put(entry.getKey(),sortl);
               }
           } 
            
        }
        for(ArrayList<Integer> l: m.values()){
            matrix.add(new ArrayList<>(l));
        }
        return matrix;   
    }
}
class pair{
    int key;
    TreeNode node;
    pair(int k,TreeNode n){
        key = k;
        node = n;
    }
}
    
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>matrix = new ArrayList<>();
        if(root==null)return matrix;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        matrix.add(new ArrayList<>());
        matrix.get(matrix.size()-1).add(root.val);
        if(root.children.size()==0)return matrix;
        
        while(q.isEmpty()!=true){
            int s = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<s; i++){
                Node temp = q.remove();
                List<Node>dummy = temp.children;
                
                for(Node x : dummy){
                    if(x.children.size()!=0)
                        q.add(x);
                    if(x!=null)   
                        list.add(x.val);
                }
                
            }
            matrix.add(new ArrayList<>(list));
        }
        return matrix;
    }
}
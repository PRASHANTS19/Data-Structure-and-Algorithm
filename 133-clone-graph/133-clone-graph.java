/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return node;
        HashMap<Integer,Node> map = new HashMap<>();
        Queue<Node> q =new LinkedList<>();
        q.add(node);
        map.put(node.val, new Node(node.val));
        
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int i=0; i<size; i++){
                Node temp = q.remove();
                
                for(Node x : temp.neighbors){
                    if(map.containsKey(x.val)==false){
                        map.put(x.val,new Node(x.val));
                        q.add(x);
                    }
                    map.get(temp.val).neighbors.add(map.get(x.val));
                }
            }
        }
        return map.get(node.val);
    }
}
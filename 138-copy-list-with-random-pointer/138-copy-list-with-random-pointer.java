/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }
        for(Map.Entry<Node,Node>entry : map.entrySet()){
            Node nex = entry.getKey().next;
            Node ran = entry.getKey().random;
            temp = entry.getValue();
            
            if(ran == null)
                temp.random = null;
            else
                temp.random = map.get(ran);
            
            if(nex == null)
                temp.next = null;
            else
                temp.next = map.get(nex);
        }        
        return map.get(head);
    }
}
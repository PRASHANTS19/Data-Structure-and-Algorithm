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
        if(head==null)return null;
        //first Insert a copy in the list, here random is not there hence we first insert all copy node
        Node temp = head;
        Node next = head;
        
        while(temp!=null){
            next = temp.next;
            Node dummy = new Node(temp.val);
            temp.next = dummy;
            dummy.next = next;
            temp = next;
        }
        
        //now point random to all dummy nodes.
        temp = head;
        while(temp!=null){
            if(temp.random!=null)
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        
        //retrive dummy linklist by removing original nodes
        temp = head;
        Node ans = new Node(-1);
        Node dummy = ans;
        while(temp!=null){
            dummy.next = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;
            dummy = dummy.next;
        }
        return ans.next;
    }
}
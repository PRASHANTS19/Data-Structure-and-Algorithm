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
        
        Node temp = head;
        Node nex = head;
        
        //step1
        while(temp!=null){
            nex = temp.next;
            Node dash = new Node(temp.val);
            temp.next = dash;
            dash.next = nex;
            temp = nex;
        }
        //step2
        temp = head;
        while(temp!=null){
            if(temp.random==null)
                temp.next.random = null;
            else
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        
        //step3
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
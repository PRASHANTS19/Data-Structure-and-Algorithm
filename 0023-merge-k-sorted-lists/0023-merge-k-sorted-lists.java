/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] arr) {
        int k = arr.length;
        PriorityQueue<pair>pq = new PriorityQueue<>((p,q)->p.val-q.val);
        for(int i=0; i<k; i++){
            if(arr[i]!=null)
                pq.add(new pair(arr[i].val,arr[i]));
        }
        ListNode start = new ListNode(-1);
        ListNode head = start;
        while(pq.isEmpty()!=true){
            pair temp = pq.remove();
            ListNode x = temp.node;
            start.next = x;
            x = x.next;
            start = start.next;
            start.next = null;
            if(x!=null){
                pq.add(new pair(x.val,x));
            }
        }
        return head.next;
    }
}
class pair{
    int val;
    ListNode node;
    pair(int v,ListNode n){
        val = v;
        node = n;
    }
}
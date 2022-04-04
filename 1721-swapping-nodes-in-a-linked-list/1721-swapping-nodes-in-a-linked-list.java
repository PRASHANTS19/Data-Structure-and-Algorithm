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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 1;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        if(k>n)return head;;
        
        temp = head;
        ListNode first = new ListNode(-1);
        ListNode last = new ListNode(-1);
        for(int i=1; i<n; i++){
            if(i==k)first = temp;
            if(i==n-k)last = temp;
            temp = temp.next;
        }
        int t = first.val;
        first.val = last.val;
         last.val=t;
        
        return head;
    }
}
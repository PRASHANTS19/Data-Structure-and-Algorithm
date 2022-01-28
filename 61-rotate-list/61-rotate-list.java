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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        if(n==0)return null;
        k=k%n;
        if(k==0)return head;
        ListNode start = head;
        ListNode end = head;
        
        for(int i=1; i<n-k; i++){
            end = end.next;
        }
        head = end.next;
        temp = head;
        end.next = null;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = start;
        return head;
        
        
    }
}
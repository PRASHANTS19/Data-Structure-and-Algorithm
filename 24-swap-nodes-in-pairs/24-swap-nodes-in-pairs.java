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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode temp = new ListNode(-1);
        ListNode ref = temp;
        
        while(head!=null){
            if(head==null || head.next==null){
                temp.next = head;
                break;
            }
            ListNode next = head.next.next;
            temp.next = reverse(head);
            temp = temp.next.next;
            head = next;
        }
        return ref.next;  
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode curr = head;
        ListNode next = curr.next;
        
        next.next = curr;
        curr.next = null;
        return next;
        
    }
}
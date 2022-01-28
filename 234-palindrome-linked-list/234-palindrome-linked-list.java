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
    public boolean isPalindrome(ListNode head) {
       
        ListNode slow = head;
        ListNode fast = head;
       while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           slow = slow.next;
       }
        if(fast!=null)slow = slow.next;
        slow = reverse(slow);
        
        while(slow!=null){
            if(head.val!=slow.val)return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=curr;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
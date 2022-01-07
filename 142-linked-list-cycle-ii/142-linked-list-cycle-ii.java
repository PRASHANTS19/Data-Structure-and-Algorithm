/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return head;
        if(head.next==null)return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow != null && fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast)break;
        }
        if(fast==null || fast.next == null)return null;
        
        fast = head;
        while(slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        
    }
}
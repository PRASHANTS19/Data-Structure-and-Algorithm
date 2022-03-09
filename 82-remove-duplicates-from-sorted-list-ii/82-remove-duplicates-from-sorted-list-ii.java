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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode list = new ListNode(-1);
        ListNode dummy = list;
        ListNode temp = head.next;
        if(head.val!=temp.val){
            ListNode n = new ListNode(head.val);
            dummy.next = n;
            dummy = dummy.next; 
        }
        ListNode prev = head;
        while(temp!=null){
            if(temp.next==null){
              if(prev.val!=temp.val){
                ListNode n = new ListNode(temp.val);
                dummy.next = n;
                dummy = dummy.next; 
                }  
            }
            else if(temp.val!=temp.next.val &&temp.val!=prev.val){
                 ListNode n = new ListNode(temp.val);
                dummy.next = n;
                dummy = dummy.next;    
            }
            temp = temp.next;
            prev = prev.next;
        }
        return list.next;
    }
}
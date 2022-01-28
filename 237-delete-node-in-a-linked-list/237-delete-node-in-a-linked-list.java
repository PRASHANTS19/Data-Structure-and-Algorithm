/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode head) {
        if(head.next == null){
            head = null;
        }
        
        head.val = head.next.val;
        head.next = head.next.next;
    }
}
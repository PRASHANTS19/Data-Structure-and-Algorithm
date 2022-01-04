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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        if(count == n)return head.next;
        temp = head;
        n = count-n;
        count = 1;
        while(count!=n){
            temp = temp.next;
            count++;
        }
        if(temp.next.next==null){
            temp.next = null;
        }
        else{
            temp.next = temp.next.next;
        }
        return head;
        
    }
}
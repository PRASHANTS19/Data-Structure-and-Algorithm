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
    public ListNode addTwoNumbers(ListNode n1, ListNode n2) {
         if(n1==null) return n2;
         if(n2==null) return n1;
        int temp =0;
        ListNode node = new ListNode(-1);
        ListNode head = node;
        while(n1!=null || n2!=null || temp!=0){
            if(n1==null && n2!=null){
                temp += n2.val;
                n2 = n2.next;
            }
            else if(n2==null && n1!=null){
                temp += n1.val;
                n1 = n1.next;
            }
            else if(n2!=null && n1!=null){
                temp += n1.val + n2.val;
                n2 = n2.next;
                n1 = n1.next;
            }
            node.next = new ListNode(temp%10);
            temp = temp/10;
            node = node.next;
        }
        node.next = null;
        return head.next;
    }
}
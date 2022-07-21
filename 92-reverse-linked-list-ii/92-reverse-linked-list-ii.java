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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        
        ListNode l = head;
        int k=1;
        while(k<left){
            l=l.next;
            k++;
        }
        ListNode temp = l;
        while(k<=right){
            stack.push(temp.val);
            temp = temp.next;
            k++;
        }
        temp = l;
        while(stack.isEmpty()!=true){
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
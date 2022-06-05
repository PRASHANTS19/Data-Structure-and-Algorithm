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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        
        ListNode[] res = new ListNode[k];
        
        int size = n/k;
        int remain = n%k;
        // System.out.print(remain + " " + n);
        int j = 0;
        ListNode start = head;
        ListNode end = head;
        while(head!=null){
            if(remain>0){
                for(int i=1; i<size+1; i++){
                    if(start.next!=null)
                        start = start.next;
                }
                remain--;
            }
            else{
                for(int i=1; i<size; i++){
                    if(start.next!=null)
                        start = start.next;
                }
            }
            end = start.next;
            start.next = null;
            res[j++] = head;
            head = end;
            start = end;
        }
        return res;
        
    }
}
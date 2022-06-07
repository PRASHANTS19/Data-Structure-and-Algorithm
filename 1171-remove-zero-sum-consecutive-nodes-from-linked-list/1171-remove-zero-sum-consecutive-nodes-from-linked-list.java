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
    public ListNode removeZeroSumSublists(ListNode head) {
        
        HashMap<Integer,ListNode> map = new HashMap<>();
        int sum = 0;
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode temp = head;
        map.put(0,start);
        while(temp!=null){
            sum += temp.val;
            if(map.containsKey(sum)==false){
                map.put(sum,temp);
            }
            else{
                ListNode dummy = map.get(sum).next;
                ListNode node = map.get(sum);
                node.next = temp.next;
                int val = sum;
                while(dummy!=temp){
                    val += dummy.val;
                    if(map.containsKey(val))
                        map.remove(val);
                    dummy = dummy.next;
                }
            }
            temp = temp.next;
        }
        return start.next;
    }
}
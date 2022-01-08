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
    ListNode root;
    int ran;
    HashMap<Integer,Integer> map;
    int count = 0;
    public Solution(ListNode head) {
      root = head;
      map = new HashMap<>();
      while(head!=null){
          map.put(count,head.val);
          count++;
          head=head.next;
      }
    }
    public int getRandom() {
        Random r = new Random();
        int random = r.nextInt(count);
        return map.get(random);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
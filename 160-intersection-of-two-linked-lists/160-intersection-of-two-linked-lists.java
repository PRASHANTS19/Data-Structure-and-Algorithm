/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> set = new HashSet<>();
//         while(headA!=null){
//             set.add(headA);
//             headA = headA.next;
//         }
//         while(headB!=null){
//             if(set.add(headB)==false && headB.val!=0){
//                 return headB;
//             }
//             set.add(headB);
//              headB = headB.next;
//         }
//         return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a!=b){
            a = a.next;
            b = b.next;
            if(a == b)return a;
            if(a==null)a = headB;
            if(b==null)b = headA;
            
        }
        return a;
        
    }
    
}
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
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
            else if(l1.val>l2.val){
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        while(l1!=null){
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }
        temp.next = null;
        return res.next;
        
        
        
        
        // ListNode dummy = mergeRecursive( l1,  l2 );
        // return dummy;
   
    }
  
    public static ListNode mergeRecursive(ListNode l1, ListNode l2){
        ListNode result;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        
        
        if(l1.val<l2.val){
            result = l1;
            result.next =  mergeRecursive( l1.next,  l2);
        }
        else{
           result = l2;
            result.next =  mergeRecursive( l1,  l2.next);
        }
        return result;
    }
}
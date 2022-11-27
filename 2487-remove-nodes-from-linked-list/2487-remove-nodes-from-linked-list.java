class Solution {
    public ListNode removeNodes(ListNode head) {
       TreeMap<Integer,Integer> map = new TreeMap<>(); 
        
        
        ListNode node = head;
        ArrayList<Integer>list = new ArrayList<>();
        while(node!=null){
            list.add(node.val);
            node = node.next;
        }
        int n = list.size();
        int right[] = new int[n+1];
        
        right[n-1] = list.get(n-1);
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],list.get(i));
        }
        
        ListNode t = new ListNode(-1);
        ListNode temp = t;
        
        for(int i=0; i<n; i++){
            if(list.get(i)>=right[i]){
                temp.next = new ListNode(list.get(i));
                temp = temp.next;
            }
            
        }
        return t.next;
        
        
        
        
    }
}
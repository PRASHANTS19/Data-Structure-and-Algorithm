class MyLinkedList {

    node start = new node(-1);
    int n;
    public MyLinkedList() {
        n=0;
    }
    
    public int get(int index) {
        if(index>=n)return -1;
        node temp = start;
        for(int i=0; i<=index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        node next = start.next;
        start.next = new node(val);
        start.next.next = next;
        n++;
        // //////
        // node temp = start;
        // while(temp!=null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next;                 
        // }
    }
    
    public void addAtTail(int val) {
        node temp = start;
        while(temp.next!=null)
            temp = temp.next;
        
        temp.next = new node(val);
        n++;
        // //
        // temp = start;
        // while(temp!=null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next;                 
        // }
    }
    
    public void addAtIndex(int index, int val) {
        if(index>n)return;
        
        node temp = start;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        node next = temp.next;
        temp.next = new node(val);
        temp.next.next = next;
        n++;
        
        // /////
        // temp = start;
        // while(temp!=null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next;                 
        // }
    }
    
    public void deleteAtIndex(int index) {
         if(index < 0 || index >= n) {
            return;
        }
        node temp = start;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        n--;
        
    }
}
class node{
    node next;
    int val;
    
    node(int v){
        val = v;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
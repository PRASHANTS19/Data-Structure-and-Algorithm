class MyCircularQueue {
    int size;
    ArrayList<Integer>list;
    int i=0,j=0;
    public MyCircularQueue(int k) {
        size = k;
        list = new ArrayList<>();
    }
    
    public boolean enQueue(int value) {
        if((j-i)>=size)return false;
        list.add(value);
        j++;
        return true;
    }
    
    public boolean deQueue() {
        if(i>=j)return false;
        i++;
        return true;
    }
    
    public int Front() {
        if(i>=j)return -1;
        return list.get(i);
    }
    
    public int Rear() {
        if(j<=i)return -1;
        return list.get(j-1);
    }
    
    public boolean isEmpty() {
        if(i>=j)return true;
        return false;
    }
    
    public boolean isFull() {
        if((j-i+1)>=size)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
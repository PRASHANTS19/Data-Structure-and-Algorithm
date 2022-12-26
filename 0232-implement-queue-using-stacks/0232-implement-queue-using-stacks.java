class MyQueue {

    ArrayList<Integer>list;
    int i = 0;
    public MyQueue() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        return list.get(i++);
    }
    
    public int peek() {
        return list.get(i);
    }
    
    public boolean empty() {
        if(i==list.size())return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
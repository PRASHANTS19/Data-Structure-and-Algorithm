class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;

    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        if(stack.isEmpty())stack.push(x);
        else{
            while(stack.isEmpty()!=true){
                temp.push(stack.pop());
            }
            stack.push(x);
            while(temp.isEmpty()!=true){
                stack.push(temp.pop());
            }
        }
    }
    
    public int pop() {
        if(stack.isEmpty())return -1;
        return stack.pop();
    }
    
    public int peek() {
        if(stack.isEmpty())return -1;
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();   
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
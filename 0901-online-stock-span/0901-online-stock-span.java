class StockSpanner {
    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    int index = -1;
    public int next(int price) {
        index++;
        if(stack.isEmpty()){
            stack.push(new int[]{index,price});
            return index+1;
        }
        else{
            while(stack.isEmpty()!=true && stack.peek()[1]<=price){
                stack.pop();
            }
            int ans= 0;
            
            if(stack.size()==0)ans= index+1;
            else ans = index-stack.peek()[0];
            stack.push(new int[]{index,price});
            return ans;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
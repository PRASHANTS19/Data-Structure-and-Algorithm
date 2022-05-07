class Solution {
    public boolean find132pattern(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int sec = Integer.MIN_VALUE;
        
        for(int i=n-1; i>=0; i--){
            if(arr[i]<sec)return true;
            
            while(stack.isEmpty()!=true && arr[i]>stack.peek()){
                sec = stack.pop();
            }
            
            stack.push(arr[i]);
        }
        return false;
    }
}
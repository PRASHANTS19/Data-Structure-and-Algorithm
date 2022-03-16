class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        if(n!=popped.length)return false;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(pushed[0]);
        
        int i=0,j=0;
        while(i<n && j<n){
            if(stack.isEmpty()!=true && stack.peek()==popped[j]){
                j++;
                stack.pop();
            }
            else{
                stack.push(pushed[i]);
                i++;
            }   
        }
        while(j<n){
            if(stack.isEmpty()!=true && stack.peek()!=popped[j]){
                return false;
            }
            stack.pop();
            j++;
        }
        return true;
    }
}
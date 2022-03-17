class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(count);
                count = 0;
            }
            else{
                count = stack.pop() + Math.max(count*2,1);
            }
        }
        return count;
    }  
}
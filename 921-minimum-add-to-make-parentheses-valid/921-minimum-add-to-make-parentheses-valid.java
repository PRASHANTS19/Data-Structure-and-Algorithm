class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                if(stack.isEmpty()!=true && stack.peek()=='(')
                    stack.pop();
                else stack.push(')');
            }
            else stack.push('(');
        }
        return stack.size();
    }
}
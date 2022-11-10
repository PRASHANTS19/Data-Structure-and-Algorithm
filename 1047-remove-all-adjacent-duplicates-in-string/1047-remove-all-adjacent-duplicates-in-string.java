class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()==false){
                if(stack.peek()==s.charAt(i)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));

        }
        String ans = "";
        for(char c : stack)
            ans += c;
        return ans;
    }
}
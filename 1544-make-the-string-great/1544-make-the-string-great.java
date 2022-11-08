class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(stack.size()>0 && (stack.peek()-'A')==(s.charAt(i)-'a')){
                    stack.pop();
                    continue;
            }
            if(stack.size()>0 && (stack.peek()-'a')==(s.charAt(i)-'A')){
                    stack.pop();
                    continue;
            }
            stack.push(s.charAt(i));
        }
        String ans = "";
        for(char c : stack)
            ans += c;
        
        return ans;
    }
}
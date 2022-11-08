class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=97 && stack.size()>0){
                if((stack.peek()-'A')==(s.charAt(i)-'a')){
                    stack.pop();
                    continue;
                }
            }
            else if(s.charAt(i)<=90 && stack.size()>0){
                if((stack.peek()-'a')==(s.charAt(i)-'A')){
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
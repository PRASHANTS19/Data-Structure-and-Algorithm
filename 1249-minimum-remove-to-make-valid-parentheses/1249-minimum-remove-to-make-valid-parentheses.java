class Solution {
    public String minRemoveToMakeValid(String s) {
        int count =0;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')' && count<1)continue;
            else if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                count++;
            }
            else if(s.charAt(i)==')' && count>0){
                stack.push(s.charAt(i));
                count--;
            }
            else stack.push(s.charAt(i));
        }
        Stack<Character> res = new Stack<>();
        while(stack.isEmpty()!=true){
            if(count>0 && stack.peek()=='('){
                stack.pop();
                count--;
            }
            else{
                res.push(stack.pop());
            }
        }
        StringBuilder ans = new StringBuilder("");
        while(res.isEmpty()!=true){
            ans.append(res.pop());
        }
        return ans.toString();
    }
}
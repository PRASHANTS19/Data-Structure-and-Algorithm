class Solution {
    public int calculate(String s) {
        int n = s.length();
        int res = 0,sign=1;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i)-'0';
                while(i<n-1 && Character.isDigit(s.charAt(i+1))){
                    num = num*10+ s.charAt(i+1)-'0';
                    i++;
                }
                res += num*sign;
            }
            else if(s.charAt(i)=='+'){
                sign = 1;
            }
            else if(s.charAt(i)=='-'){
                sign = -1;
            }
            else if(s.charAt(i)=='('){
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }
            else if(s.charAt(i)==')'){
                res = res*stack.pop();
                res += stack.pop();
            }
        }
        return res;
                      
        
        
    }
}
class Solution {
    public int evalRPN(String[] arr) {
        
        Stack<Integer>stack = new Stack<>();
        
        for(String s : arr){
            if(s.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(s.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(s.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(s.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();

    }
}
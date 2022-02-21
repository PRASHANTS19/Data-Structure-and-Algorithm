class Solution {
    public String removeKdigits(String str, int k) {
        int n = str.length();
        if(k==n)return "0";
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
           while(k>0 && stack.size()>0 && stack.peek()>str.charAt(i)){
               stack.pop();
               k--;
           }
            stack.push(str.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        Stack<Character> aux = new Stack<>();
        while(stack.isEmpty()!=true){
            aux.push(stack.pop());
        }
        while(aux.size()>0 && aux.peek()=='0'){
            aux.pop();
        }
        String res = "";
        while(aux.isEmpty()!=true){
            res += aux.pop();
        }
        if(res == "")return "0";
        return res;
    }
}
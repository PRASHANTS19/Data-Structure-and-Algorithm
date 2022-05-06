class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<pair> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty())stack.push(new pair(s.charAt(i),1));
            else if(s.charAt(i)==stack.peek().ch){
                stack.peek().count++;
            }
            else{
                stack.push(new pair(s.charAt(i),1));
            }
            
            if(stack.peek().count==k)stack.pop();
        }
        
        StringBuilder res = new StringBuilder("");
        
        while(stack.isEmpty()!=true){
            char c = stack.peek().ch;
            int size = stack.peek().count;
            for(int i=0; i<size; i++){
                res.append(c);
            }    
            stack.pop();
        }
        res = res.reverse();
        return res.toString();
        
    }
}
class pair{
    char ch;
    int count;
    
    pair(char c, int cou){
        ch = c;
        count = cou;
    }
}
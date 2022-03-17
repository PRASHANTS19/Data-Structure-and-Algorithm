class Solution {
    public int scoreOfParentheses(String s) {
        Stack<pair> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        stack.push(new pair('(',0));
        map.put(0,0);
      
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(new pair('(',i));
                map.put(i,map.get(i-1));
            }
            else if(s.charAt(i)==')'){
                if(stack.peek().symbol=='(' && stack.peek().index+1==i){
                    map.put(i,map.get(i-1)+1);
                    stack.pop();    
                }
                else if(stack.peek().symbol=='('){
                    int x = map.get(stack.peek().index)+(map.get(i-1)-map.get(stack.peek().index))*2;
                    map.put(i,x);
                    stack.pop();
                }
            }
        }
        return map.get(s.length()-1);
    }
}
class pair{
    char symbol;
    int index;
    
    pair(char c , int i){
        symbol = c;
        index = i;
    }
}
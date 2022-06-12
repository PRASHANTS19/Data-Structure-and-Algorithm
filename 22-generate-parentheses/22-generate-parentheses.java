class Solution {
    public List<String> generateParenthesis(int n) {
        HashSet<String> set = new HashSet<>();
        solve(2*n,"",set);
        
        List<String> list = new ArrayList<>();
        for(String s : set)
            list.add(s);
        
        return list;   
    }
    void solve(int n, String s, HashSet<String> set){
        if(n==0){
            if(valid(s))
                set.add(s);
            return;
        }
        
        solve(n-1,s+'(',set);
        solve(n-1,s+')',set);
    }
    boolean valid(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'&& stack.isEmpty())
                return false;
            else if(s.charAt(i)=='(')
                stack.add('(');
            else if(s.charAt(i)==')'){
                if(stack.peek()!='(')return false;
                else stack.pop();
            }
        }
        if(stack.isEmpty())return true;
        
        return false;
    }
}
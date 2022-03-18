class Solution {
    public String removeDuplicateLetters(String s) {
        
        Stack<Integer> stack = new Stack<>();
        boolean seen[] = new boolean[26];
        int last[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            last[s.charAt(i)-'a']=i;
        }
        
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i)-'a';
            if(seen[c])continue;
            seen[c]=true;
            while(!stack.isEmpty() && stack.peek()>c && i<last[stack.peek()])
                seen[stack.pop()]=false;
            
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i:stack){
            char c = (char)('a'+i);
            sb.append(c);
        }
        return sb.toString();
    }
}
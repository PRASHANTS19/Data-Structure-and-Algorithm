class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
	for(int i=0; i<str.length(); i++)
    {
        if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='('){
            st.push(str.charAt(i));
        }
        else{
            if(st.isEmpty())return false;
            char c = st.pop();
            if(str.charAt(i)==']' && c=='[')continue;
            else if(str.charAt(i)=='}' && c=='{')continue;
            else if(str.charAt(i)==')' && c=='(')continue;
            else return false;
            }
    }
        if(st.isEmpty()!=true)return false;
         return true;
    }
}
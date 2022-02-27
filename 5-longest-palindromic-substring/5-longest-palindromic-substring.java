class Solution {
    private int start,maxlen;
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        String res= "";
        
        for(int i=0; i<s.length(); i++){
            strechpalindrome(s,i,i);
            strechpalindrome(s,i,i+1);
        }
        return s.substring(start,start+maxlen);
    }
    void strechpalindrome(String str,int i,int j){
        while(i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        if(maxlen<j-i-1){
           start=i+1;
            maxlen = j-i-1;
        }
    }
    
}
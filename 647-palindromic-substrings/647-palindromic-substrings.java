class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        for(int i=0; i<s.length(); i++){
            res+=palindrome(i,i,s);
            res+=palindrome(i,i+1,s);
        }
        return res;
    }
    int palindrome(int start,int end,String s){
        int n = s.length();
        int count=0;
        
        while(start>=0 && end<n){
            if(s.charAt(start)==s.charAt(end)){
                count++;
                start--;end++;
            }
            else break;
        }
        return count;
    }
}
class Solution {
    public int balancedStringSplit(String s) {
        
        int r=0;
        int l=0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='R')r++;
            else l++;
            
            if(r!=0 && r==l){
                count++;
                r=0; l=0;
            }
        }
        return count;
    }
}
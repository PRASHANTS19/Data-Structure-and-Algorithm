class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            ans += pal(s,i,i);
            ans += pal(s,i,i+1);
        }
        return ans;
        
    }
    int pal(String s, int i,int j){
        
       int count = 0;
        while(i>=0 && j<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                i--; j++;
                count++;
            }
            else return count;
        }
        return count;
    }
}

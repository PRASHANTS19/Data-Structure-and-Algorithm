class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                ans += pal(s,i,j);
            }
        }
        return ans;
        
    }
    int pal(String s, int i,int j){
        
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++; j--;
            }
            else return 0;
        }
        return 1;
    }
}

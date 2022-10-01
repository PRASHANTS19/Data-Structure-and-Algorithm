class Solution {
    int dp[];
    public int numDecodings(String s) {
       int n = s.length();
        dp = new int[n];
        Arrays.fill(dp,-1);
        
        return solve(s,0);
    }
    int solve(String s,int i){
        if(i>=s.length())return 1; 
        if(s.charAt(i)=='0')return 0;
        if(i==s.length()-1)return 1;
        
        if(dp[i]!=-1)return dp[i];
        
        int n = (s.charAt(i)-'0')*10 + (s.charAt(i+1)-'0');
        int select=0,notselect=0;
        notselect = solve(s,i+1);
        if(n>0 && n<=26){
            select = solve(s,i+2);
        }
        
        
        return dp[i]=select+notselect;
    }
}
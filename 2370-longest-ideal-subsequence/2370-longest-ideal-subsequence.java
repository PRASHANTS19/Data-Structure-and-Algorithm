class Solution {
    
    int dp[][];
    public int longestIdealString(String s, int k) {
      
        dp = new int[s.length()][126];
        for(int i=0; i<s.length(); i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(s,k,'A',0);
        
    }
    int solve(String s,int k,char prev,int i){
        if(i>=s.length())return 0;
        
        if(dp[i][prev]!=-1)return dp[i][prev];
        int notselect = 0+solve(s,k,prev,i+1);
        int select = 0;
        if(prev=='A' ||Math.abs(s.charAt(i)-prev)<=k){
            select = 1+solve(s,k,s.charAt(i),i+1);
        }
        return dp[i][prev]=Math.max(select,notselect);
        
    }
}
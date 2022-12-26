class Solution {
    int dp[][];
    public int longestCommonSubsequence(String t1, String t2) {
        dp = new int[t1.length()][t2.length()];
        
        for(int i=0; i<t1.length(); i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(0,0,t1,t2);
    }
    int solve(int i,int j,String t1, String t2){
        if(i>=t1.length() || j>=t2.length())return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        int select=0,ns1=0,ns2=0;
        
        if(t1.charAt(i)==t2.charAt(j)){
            select = 1+solve(i+1,j+1,t1,t2);
        }
        ns1 = 0+solve(i+1,j,t1,t2);
        ns2 = 0+solve(i,j+1,t1,t2);
        
        return dp[i][j]=Math.max(select,Math.max(ns1,ns2));
    }
}
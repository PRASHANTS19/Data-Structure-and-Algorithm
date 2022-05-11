class Solution {
    public int countVowelStrings(int n) {
        
        int dp[][] = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                dp[i][j]=-1;
            }
        }
        
        return solve(4,n,0,dp);
    }
    int solve(int i,int n,int count,int[][] dp){
        if(i<0)return 0;
        if(count==n)return 1;
        
        if(dp[count][i]!=-1)return dp[count][i];
        
        int select = solve(i,n,count+1,dp);
        int notselect = solve(i-1,n,count,dp);
        
        return dp[count][i]=select+notselect;
    }
}
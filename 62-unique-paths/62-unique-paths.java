class Solution {
    public int uniquePaths(int m, int n) {
        
      int dp[][] = new int[m][n];
        for(int x[] : dp){
            Arrays.fill(x,-1);
        }
		return solve(m-1,n-1,dp);
	}
    static int solve(int m,int n,int dp[][]){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        int x = solve(m-1,n,dp);
        int y = solve(m,n-1,dp);
        return dp[m][n]=x+y;
    }
}
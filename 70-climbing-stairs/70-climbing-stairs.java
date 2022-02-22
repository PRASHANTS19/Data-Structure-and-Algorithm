class Solution {
    public int climbStairs(int n) {
       long dp[] = new long[n+1];
        Arrays.fill(dp,-1);
        return (int)solve(dp,(int)n);
	}
    static long solve(long dp[],int n){
        if(n<0)return 0;
        if(n==0 || n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        
        dp[n] = solve(dp,n-1) + solve(dp,n-2);
        
        return dp[n];
    }
}
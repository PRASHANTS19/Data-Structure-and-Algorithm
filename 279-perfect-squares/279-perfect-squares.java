class Solution {
    int dp[];
    int x = (int)1e9;
    public int numSquares(int n) {

        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
        
    }
    int solve(int n){
        if(n==0){
            return 0;
        }
        if(n<0)return (int)1e9;
        if(dp[n]!=-1)return dp[n];
        
        for(int i=1; i<=Math.sqrt(n); i++){
            x = Math.min(x,1+solve(n-i*i));
        }
        return dp[n] = x;
    }
}
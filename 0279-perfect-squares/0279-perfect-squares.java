class Solution {
    int dp[];
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,(int)1e9);
        return solve(n);
    }
    int solve(int n){
        if(n==0)return 0;
        if(dp[n]!=(int)1e9)return dp[n];
        
        int ans = (int)1e9;
        for(int i=1; i*i<=n; i++){
            int temp = solve(n-i*i)+1;
            ans = Math.min(temp,ans);
        }
        return dp[n]=ans;
            
    }
}
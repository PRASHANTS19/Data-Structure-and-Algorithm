class Solution {
    Boolean[] dp = null;
    public boolean divisorGame(int n) {
        dp = new Boolean[Math.max(2,n+1)];
        dp[0] = true;
        dp[1] = false;
        boolean res = helper(n);
        return res;
    }
    private boolean helper(int n){
        if(dp[n] != null) return dp[n];
        dp[n] = false;
        for(int x=1; x*x <= n; x++)
            if(n % x == 0)
                if(!helper(n-x) || !helper(n-(n/x))){
                    dp[n] = true;
                    break;
                }
        return dp[n];
    }
}
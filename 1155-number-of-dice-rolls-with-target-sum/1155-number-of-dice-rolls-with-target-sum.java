class Solution {
    int dp[][];
    int mod = (int)1e9+7;
    public int numRollsToTarget(int n, int k, int target) {
        dp = new int[n+1][target+1];
        
        for(int i=0; i<=n; i++){
                Arrays.fill(dp[i],-1);
        }
        return solve(n,k,target);
        
    }
    int solve(int n, int k, int target){
        // if(target<0)return 0;
        if(n==0 && target==0)return 1;
        if(n==0 || target<=0)return 0;
        
        if(dp[n][target]!=-1)return dp[n][target];
        
        int res = 0;
        for(int i=1; i<=k; i++){
            res = (res+solve(n-1,k,target-i))%mod;
        }
        return dp[n][target]=res%mod;
        
    }
}



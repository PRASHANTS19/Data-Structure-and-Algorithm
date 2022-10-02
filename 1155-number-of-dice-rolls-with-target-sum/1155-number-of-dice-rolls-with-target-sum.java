class Solution {
    int mod = (int)1e9+7;
    int dp[][];
    public int numRollsToTarget(int n, int k, int target) {
        
        dp = new int[31][1001];
        for(int i=0; i<31; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n,k,target);
    }
    int solve(int n,int k,int target){
        if(n==0 && target==0)return 1;
        if(n<=0 || target<0)return 0;
        
        if(dp[n][target]!=-1)return dp[n][target];
        int x = 0;
        for(int i=1; i<=k; i++){
            x = (x+solve(n-1,k,target-i)%mod)%mod;
        }
        return dp[n][target]=x%mod;
    }
}
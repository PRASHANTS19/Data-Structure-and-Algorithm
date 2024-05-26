class Solution {
    int mod = (int)1e9+7;
    long dp[][][];
    public int checkRecord(int n) {
        dp = new long[n+1][2][3];
        
        for(int i=0; i<n+1; i++){
            for(int j=0; j<2; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        
        return (int)solve(n,1,2)%mod;
    }
    long solve(int i, int a, int l){
        if(i<=0)return 1;
        if(dp[i][a][l]!=-1)return dp[i][a][l]%mod;
        long aa=0,ll=0,pp=0;
        if(a>0){
            aa = solve(i-1,a-1,2)%mod;
        }
        if(l>0){
            ll = solve(i-1,a,l-1)%mod;
        }
        pp = solve(i-1,a,2)%mod;
        
        return dp[i][a][l]=(aa%mod+ll%mod+pp%mod)%mod;
    }
}
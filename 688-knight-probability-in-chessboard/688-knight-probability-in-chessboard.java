class Solution {
    double dp[][][];
    public double knightProbability(int n, int k, int i, int j) {
       
         dp = new double[n][n][k+1];
        
        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                Arrays.fill(dp[x][y],-1);
            }
        }
        
        return solve(i,j,n,k);
    }
    double solve(int i,int j,int n,int k){
        if(i>=n||j>=n||i<0||j<0){
            return 0;
        }
        if(k==0)return 1;
        if(dp[i][j][k]!=-1)return dp[i][j][k];
        
        double a=solve(i+2,j+1,n,k-1)
        +solve(i+2,j-1,n,k-1)
        +solve(i+1,j+2,n,k-1)
        +solve(i-1,j+2,n,k-1)
        +solve(i+1,j-2,n,k-1)
        +solve(i-1,j-2,n,k-1)
        +solve(i-2,j+1,n,k-1)
        +solve(i-2,j-1,n,k-1);
        
        double res = a/8.0;
        return dp[i][j][k]=res;
        
        
    }
}
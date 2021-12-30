class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][] = new int[m][n];
        
        return solve(dp,0,0,m,n); 
    }
    int solve(int[][]dp,int i,int j,int m, int n){
        if(i<0||j<0||i>=m||j>=n)return 0;
        else if(i==m-1 || j==n-1){
            return 1;
        }
        else if(dp[i][j]>0)return dp[i][j];
        else{
            dp[i][j] = solve(dp,i+1,j,m,n)+solve(dp,i,j+1,m,n);
            return dp[i][j];
        }
            
    }
}
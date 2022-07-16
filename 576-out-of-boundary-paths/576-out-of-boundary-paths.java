class Solution {
    int dp[][][];
    int modulo = (int)1e9+ 7;
    public int findPaths(int m, int n, int maxMove, int i, int j) {
        dp = new int[m][n][maxMove+1];
        
        for(int ii=0; ii<m; ii++){
            for(int jj=0; jj<n; jj++)
                Arrays.fill(dp[ii][jj],-1);
        }
        return solve(m,n,maxMove,i,j);
    }
    int solve(int m,int n,int max,int i,int j){
        if(i>=m||j>=n||i<0||j<0)return 1;
        if(max<=0)return 0;
        
        if(dp[i][j][max]!=-1)return dp[i][j][max]%modulo;
        int temp = 0;
        temp= (temp+solve(m,n,max-1,i+1,j))%modulo;
        temp =(temp+solve(m,n,max-1,i-1,j))%modulo;
        temp=(temp+solve(m,n,max-1,i,j+1))%modulo;
        temp=(temp+solve(m,n,max-1,i,j-1))%modulo;
        
        return dp[i][j][max]=(temp)%modulo;
    }
}
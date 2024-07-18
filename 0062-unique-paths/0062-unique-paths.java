class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(m-1,n-1,new boolean[m][n]);
    }
    int solve(int i,int j, boolean visited[][]){
        if(i<0||j<0 || visited[i][j])return 0;
        
        if(i==0 && j==0){
            return 1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        
        visited[i][j] = true;
        int x = solve(i-1,j,visited);
        int y = solve(i,j-1, visited);
        visited[i][j] = false;
        
        
        return dp[i][j]=x+y;
        
    }
}
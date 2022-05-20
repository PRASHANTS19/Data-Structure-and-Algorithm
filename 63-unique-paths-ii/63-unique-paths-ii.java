class Solution {
    int dp[][];
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        dp = new int[m][n];
        for(int i=0; i<m; i++)
            Arrays.fill(dp[i],-1);
        
        return solve(arr,m-1,n-1,new boolean[m][n]);
    }
    int solve(int[][] arr,int m,int n,boolean visited[][]){
        if(m<0||n<0||arr[m][n]==1||visited[m][n]==true)return 0;
        
        if(m==0 && n==0)return 1;
        
        if(dp[m][n]!=-1)return dp[m][n];
        
        visited[m][n]=true;
        int up = solve(arr,m-1,n,visited);
        int left = solve(arr,m,n-1,visited);
        visited[m][n]=false;
        
        return dp[m][n]=up+left;
    }
}
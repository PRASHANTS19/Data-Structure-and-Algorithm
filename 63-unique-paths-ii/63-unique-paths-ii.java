class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        
        int dp[][] = new int[m][n];
        
        for(int x[] : dp){
            Arrays.fill(x,-1);
        }
        return solve(arr,m-1,n-1,dp);
        
        
    }
    int solve(int arr[][],int m,int n,int dp[][]){
        if(m<0 || n<0 || arr[m][n]==1)return 0;
        if(m==0 && n==0)return 1;
        
        if(dp[m][n]!=-1)return dp[m][n];
        
        int x = solve(arr,m-1,n,dp);
        int y = solve(arr,m,n-1,dp);
        
        return dp[m][n]=x+y;
    }
}
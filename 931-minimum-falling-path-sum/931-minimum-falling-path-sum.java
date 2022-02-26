class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int m = matrix.length;
        int n = m;
        int dp[][] = new int[m][n];
        
        for(int x[] : dp){
            Arrays.fill(x,Integer.MAX_VALUE);
        }
        int res = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            res = Math.min(res,solve(matrix,m-1,i,dp));
        }
        
        return res;
        
    }
    int solve(int arr[][],int m,int n,int[][] dp){
        if(m==0 && n>=0 && n<arr[m].length)return arr[m][n];
        if(m<0 || n<0 || n>=arr[m].length)return Integer.MAX_VALUE;
        
        if(dp[m][n]!=Integer.MAX_VALUE)return dp[m][n];
        
        int x1 = solve(arr,m-1,n,dp);
        int x2 = solve(arr,m-1,n-1,dp);
        int x3 = solve(arr,m-1,n+1,dp);
        
        return dp[m][n]=arr[m][n]+Math.min(Math.min(x1,x2),x3);
    }
}
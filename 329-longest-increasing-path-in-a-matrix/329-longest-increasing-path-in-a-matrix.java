class Solution {
    int res=0;
    int dp[][];
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean visited[][] = new boolean[m][n];
        dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               res = Math.max(res, solve(matrix,visited,i,j,m,n,-1,0));
            }
        }
        return res;
        
    }
    int solve(int matrix[][],boolean visited[][],int i,int j,int m,int n,int prev,int count){
        if(i>=m||j>=n||i<0||j<0||visited[i][j]==true||matrix[i][j]<=prev)return 0;
        if(dp[i][j]!=0)return dp[i][j];
        int temp = 0;
            visited[i][j]=true;
            temp = Math.max(temp,solve(matrix,visited,i+1,j,m,n,matrix[i][j],count+1));
            temp = Math.max(temp,solve(matrix,visited,i,j+1,m,n,matrix[i][j],count+1));
            temp = Math.max(temp,solve(matrix,visited,i-1,j,m,n,matrix[i][j],count+1));
            temp = Math.max(temp,solve(matrix,visited,i,j-1,m,n,matrix[i][j],count+1));
            visited[i][j]=false;
        return dp[i][j]=temp+1;
    }
}
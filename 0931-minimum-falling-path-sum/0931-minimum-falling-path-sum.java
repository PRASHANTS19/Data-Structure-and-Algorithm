class Solution {
    int dp[][];
    public int minFallingPathSum(int[][] arr) {
        int n= arr.length;
        dp = new int[n][n];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        int ans = (int)1e9;
        for(int i=0; i<n; i++){
            ans = Math.min(ans,solve(arr,n,0,i));
        }
        return ans;
        
        
    }
    int solve(int arr[][],int n,int i,int j){
        if(i<0||j<0||i>n-1||j>n-1)return (int)1e9;
        if(i==n-1){
            return arr[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        int x = solve(arr,n,i+1,j);
        int y = solve(arr,n,i+1,j+1);
        int z = solve(arr,n,i+1,j-1);
        
        return dp[i][j]=arr[i][j]+Math.min(Math.min(x,y),z);
    }
}
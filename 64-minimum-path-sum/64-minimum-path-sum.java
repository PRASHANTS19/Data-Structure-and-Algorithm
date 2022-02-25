class Solution {
    public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];
        
        for(int x[] : dp)
            Arrays.fill(x,-1);
        
        return solve(arr,m-1,n-1,dp); 
    }
    int solve(int arr[][],int m,int n,int dp[][]){
        if(m<0 || n<0)return (int)Math.pow(10,9);
        if(m==0 && n==0)return arr[0][0];
        
        if(dp[m][n]!=-1)return dp[m][n];
        
        int x = arr[m][n]+solve(arr,m-1,n,dp);
        int y = arr[m][n]+solve(arr,m,n-1,dp);
        
        return dp[m][n]= Math.min(x,y);
    }
}
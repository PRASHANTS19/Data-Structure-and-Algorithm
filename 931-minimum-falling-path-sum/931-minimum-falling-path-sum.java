class Solution {
    
    public int minFallingPathSum(int[][] arr) {
        int n= arr.length;
        int dp[][] = new int[n][n];
        
        for(int i=0; i<n; i++){
            dp[n-1][i] = arr[n-1][i];
        }
        
        for(int i=n-2; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int x = (int)1e9; int y = (int)1e9; int z = (int)1e9;
                
                    x = dp[i+1][j];
                if(j!=n-1)
                     y = dp[i+1][j+1];
                if(j!=0)
                     z = dp[i+1][j-1];
                
                dp[i][j]=arr[i][j]+Math.min(Math.min(x,y),z);
            }
        }
        int min = (int)1e9;
        for(int i=0; i<n; i++){
            min = Math.min(min,dp[0][i]);
        }
        return min;
    }
    
//     int solve(int arr[][],int n,int i,int j){
//         if(i<0||j<0||i>n-1||j>n-1)return (int)1e9;
//         if(i==n-1){
//             return arr[i][j];
//         }
//         if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        
//         int x = solve(arr,n,i+1,j);
//         int y = solve(arr,n,i+1,j+1);
//         int z = solve(arr,n,i+1,j-1);
        
//         return dp[i][j]=arr[i][j]+Math.min(Math.min(x,y),z);
//     }
}
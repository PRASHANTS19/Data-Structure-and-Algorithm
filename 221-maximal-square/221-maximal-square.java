class Solution {
    public int maximalSquare(char[][] arr) {
        
        int row = arr.length;
        int col = arr[0].length;
        // if(row==1 || col==1)return 1;
        
        int dp[][] = new int[row][col];
        
        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=0; j--){
               if(i==row-1 || j==col-1){
                   if(arr[i][j]=='0')
                        dp[i][j] = 0;
                   else 
                       dp[i][j] = 1;
                } 
            }
        }
        
        for(int i=row-2; i>=0; i--){
            for(int j=col-2; j>=0; j--){
                if(arr[i][j]=='1')
                    dp[i][j] = 1+ Math.min(Math.min(dp[i+1][j],dp[i+1][j+1]),dp[i][j+1]);
            }
        }
        int max = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                max = Math.max(max,dp[i][j]);
            }
        }
        return max*max;
        
    }
}
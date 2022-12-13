class Solution {
    int dp[][];
    public int minFallingPathSum(int[][] arr) {
        int n = arr.length;
        dp = new int[n][n];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],(int)1e9);
        }
        int min = (int)1e9;
        
        for(int i=0; i<arr[0].length; i++){
            min = Math.min(min,solve(arr,0,i,new boolean[n][n]));
        }
        return min;
    }
    int solve(int[][] arr,int i,int j,boolean[][] visited){
        if(i<0 || j<0 || i>=arr.length|| j>=arr[0].length)return (int)1e9;
        if(i==arr.length-1){
             return arr[i][j];
         }
        if(dp[i][j]!=(int)1e9)return dp[i][j];
        
        int left = solve(arr,i+1,j-1,visited);
        int right = solve(arr,i+1,j,visited);
        int down = solve(arr,i+1,j+1,visited);
        
        
        return dp[i][j]=arr[i][j]+ Math.min(left,Math.min(right,down));
        
    }
}
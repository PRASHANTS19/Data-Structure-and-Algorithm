class Solution {
    int dp[][];
    public int lengthOfLIS(int[] arr) {
        
        int n =arr.length;
        dp = new int[n][n+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,arr, -1);
    }
    int solve(int n,int[] arr,int prev_index){
        if(n<0)return 0;
        if(dp[n][prev_index+1]!=-1)return dp[n][prev_index+1];
        int notselect = solve(n-1,arr,prev_index);
        
        int select = 0;
        if(prev_index==-1||arr[n]<arr[prev_index]){
            select = 1+solve(n-1,arr,n);
        }
        
        return dp[n][prev_index+1]=Math.max(select,notselect);
    }
}
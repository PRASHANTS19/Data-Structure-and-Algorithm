class Solution {
    // int dp[];
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        
        if(n==2)return Math.min(arr[0],arr[1]);
        
        dp[0] = arr[0];
        dp[1] = arr[1];
        
        for(int i=2; i<n; i++){
            dp[i] = arr[i]+Math.min(dp[i-1],dp[i-2]);
        }
        
        return Math.min(dp[n-1],dp[n-2]);
        
        
    }
//     int solve(int arr[],int n){
//         if(n<0)return 0;
//         if(dp[n]!=-1)return dp[n];
//         int one = arr[n]+solve(arr,n-1);
//         int two = arr[n]+solve(arr,n-2);
        
//         return dp[n]=Math.min(one,two);
//     }
}
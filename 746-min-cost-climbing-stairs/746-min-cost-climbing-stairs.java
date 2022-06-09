class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        int x = solve(arr,n-1);
        Arrays.fill(dp,-1);
        int y = solve(arr,n-2);
        int res = Math.min(x,y);
        
        return res;
    }
    int solve(int arr[],int n){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int one = arr[n]+solve(arr,n-1);
        int two = arr[n]+solve(arr,n-2);
        
        return dp[n]=Math.min(one,two);
    }
}
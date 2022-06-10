class Solution {
    int dp[][];
    public int maxProfit(int[] arr, int fee) {
        int n = arr.length;
        dp = new int[n][2];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(arr,0,0,fee);
    }
    int solve(int arr[],int ind,int buy,int fee){
        if(ind==arr.length)return 0;
        if(dp[ind][buy]!=-1)return dp[ind][buy];
        int profit = 0;
        if(buy==0){
            profit = Math.max(solve(arr,ind+1,0,fee),-arr[ind]+solve(arr,ind+1,1,fee));
        }
        else{
            profit = Math.max(solve(arr,ind+1,1,fee),arr[ind]+solve(arr,ind+1,0,fee)-fee);
        }
        return dp[ind][buy]=profit;
    }
}
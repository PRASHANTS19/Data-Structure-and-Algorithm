class Solution {
    int dp[][];
    public int coinChange(int[] arr, int amount) {
        int n =arr.length;
        
        dp = new int[n][amount+1];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        int ans = solve(arr,amount,n-1);
        if(ans>=(int)1e9)return -1;
        return ans;
    }
    
    int solve(int arr[],int amount,int n){
        if(amount==0)return 0;
        if(amount<0 || n<0)return (int)1e9;
        
        if(dp[n][amount]!=-1)return dp[n][amount];
        
        int notpick = 0+solve(arr,amount,n-1);
        int pick = (int)1e9;
        if(amount>=arr[n])
            pick = 1+solve(arr,amount-arr[n],n);
        
        return dp[n][amount]=Math.min(notpick,pick);
    }
}
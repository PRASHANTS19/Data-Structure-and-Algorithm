class Solution {
    int dp[][];
    public int coinChange(int[] arr, int amount) {
        int n = arr.length;
        dp = new int[n][amount+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(arr,n-1,amount); 
        return ans==(int)1e9?-1:ans;
    }
    int solve(int arr[],int n,int amount){
        if(n==0){
            if(amount%arr[0]==0)return amount/arr[0];
            else return (int)1e9;
        }
        if(dp[n][amount]!=-1)return dp[n][amount];
        
        int notselect = 0+solve(arr,n-1,amount);
        int select = (int)1e9;
        if(amount>=arr[n]){
            select = 1+solve(arr,n,amount-arr[n]);
        }
        return dp[n][amount]=Math.min(select,notselect);
    }
}
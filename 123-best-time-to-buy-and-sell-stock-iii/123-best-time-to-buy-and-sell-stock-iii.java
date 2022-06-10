class Solution {
    int dp[][][];
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int tran = 2;
        dp = new int[n][2][tran+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        return solve(arr,0,0,tran);
    }
    int solve(int arr[],int ind,int buy,int tran){
        if(tran==0 || ind==arr.length)return 0;
        
        if(dp[ind][buy][tran]!=-1)return dp[ind][buy][tran];
        int profit = 0;
        if(buy==0){
            profit = Math.max(solve(arr,ind+1,0,tran),-arr[ind]+solve(arr,ind+1,1,tran));
        }
        else if(buy==1){
            profit = Math.max(solve(arr,ind+1,1,tran),arr[ind]+solve(arr,ind+1,0,tran-1));
        }
        return dp[ind][buy][tran]=profit;
    }
}
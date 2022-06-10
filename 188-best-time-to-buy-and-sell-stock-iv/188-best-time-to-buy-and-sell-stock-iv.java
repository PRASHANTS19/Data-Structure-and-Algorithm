class Solution {
    int dp[][][];
    public int maxProfit(int k, int[] arr) {
        
        int n = arr.length;
        dp = new int[n][2][k+1];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(arr,0,0,k);
    }
    int solve(int arr[],int buy,int ind,int tran){
        if(ind==arr.length || tran==0)return 0;
        
        if(dp[ind][buy][tran]!=-1)return dp[ind][buy][tran];
        int profit = 0;
        if(buy==0){
            profit = Math.max(solve(arr,0,ind+1,tran),-arr[ind]+solve(arr,1,ind+1,tran));
        }
        else if(buy==1){
            profit = Math.max(solve(arr,1,ind+1,tran),arr[ind]+solve(arr,0,ind+1,tran-1));   
        }
        
        return dp[ind][buy][tran]=profit;
    }
}
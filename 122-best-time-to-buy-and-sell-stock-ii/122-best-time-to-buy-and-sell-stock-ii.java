class Solution {
    int dp[][];
    public int maxProfit(int[] arr) {
     int n = arr.length;
     dp = new int[n][2];
      for(int i=0; i<n; i++){
          Arrays.fill(dp[i],-1);
      } 
     return solve(arr,0,0);   
    }
    int solve(int arr[],int ind, int buy){
        if(ind==arr.length)return 0;
        if(dp[ind][buy]!=-1)return dp[ind][buy];
        int select = 0;
        int notselect = 0;
        
        if(buy==0){
            notselect = solve(arr,ind+1,0);
            select = -arr[ind]+solve(arr,ind+1,1);
        }
        if(buy==1){
            notselect = solve(arr,ind+1,1);
            select = arr[ind]+solve(arr,ind+1,0);
        }
        return dp[ind][buy]=Math.max(notselect,select);
    }
}
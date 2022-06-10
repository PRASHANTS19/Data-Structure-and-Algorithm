class Solution {
    int dp[][][];
    public int maxProfit(int[] arr) {
        int n = arr.length;
        dp = new int[n][2][2];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        return solve(arr,0,0,0);
    }
    int solve(int arr[],int ind,int buy,int cool){
        if(ind==arr.length)return 0;
        
        if(dp[ind][buy][cool]!=-1)return dp[ind][buy][cool];
        
        int profit=0;
        if(buy==0){
            int notselect = 0; int select = 0;
            if(cool==1){
                notselect = solve(arr,ind+1,0,0);
            }
            else{
                select = Math.max(solve(arr,ind+1,0,0),-arr[ind]+solve(arr,ind+1,1,0));
            }
            profit = Math.max(select,notselect);
        }
        else{//buy == 1;
            profit = Math.max(solve(arr,ind+1,1,0),arr[ind]+solve(arr,ind+1,0,1));
        }
        return dp[ind][buy][cool]=profit;
    }
}
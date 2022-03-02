class Solution {
    public int coinChange(int[] arr, int x) {
         int n = arr.length;
        int dp[][] = new int[n][x+1];
        for(int d[] : dp)Arrays.fill(d,-1);
        
        int ans= solve(n-1,x,arr,dp);
        if(ans>=(1e9))return -1;
        return ans;
    }
	static int solve(int n, int target,int arr[],int dp[][]){
//         if(target<=0)return (int)1e9;will not add because already cover in pick condition
        if(n==0){
            if(target%arr[0]==0)return target/arr[0];
            else return (int)1e9;
        }
        if(dp[n][target]!=-1)return dp[n][target];
        
        int notpick = 0+solve(n-1,target,arr,dp); 
        int pick = (int)1e9;
        if(target>=arr[n]){
            pick = 1+solve(n,target-arr[n],arr,dp);
        }
        return dp[n][target]=Math.min(pick,notpick);
    }
}
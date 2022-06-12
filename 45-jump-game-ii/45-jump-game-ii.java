class Solution {
    int dp[];
    public int jump(int[] arr) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,0);
    }
    int solve(int arr[],int ind){
        if(ind>=arr.length-1)return 0;
        
        if(dp[ind]!=-1)return dp[ind];
        int ans = (int)1e9;
        for(int i=arr[ind]; i>0; i--){
            ans = Math.min(ans,1+solve(arr,ind+i));
        }
        
        return dp[ind]=ans;
    }
}
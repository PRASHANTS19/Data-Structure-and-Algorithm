class Solution {
    int dp[];
    public int rob(int[] arr) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return solve(arr,0);
    }
    int solve(int arr[],int i){
        if(i>=arr.length)return 0;
        
        if(dp[i]!=-1)return dp[i];
        int select = solve(arr,i+2)+arr[i];
        int notselect = solve(arr, i+1);
        
        return dp[i]=Math.max(select,notselect);
    }
}
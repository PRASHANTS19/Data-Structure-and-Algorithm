class Solution {
    int dp[];
    public int combinationSum4(int[] arr, int target) {
        dp = new int[target+1];
        
      
            Arrays.fill(dp,-1);
      
        return solve(arr,target);
    }
    int solve(int arr[],int target){
        if(target==0)return 1;
        if(dp[target]!=-1)return dp[target];
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(target>=arr[i])
                res += solve(arr,target-arr[i]);
        }
        return dp[target]=res;
    }
}
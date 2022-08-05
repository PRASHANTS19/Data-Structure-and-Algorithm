class Solution {
    int dp[][];
    public int combinationSum4(int[] nums, int target) {
        dp = new int[nums.length][target+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,target,0);
    }
    int solve(int arr[],int target,int i){
        if(target==0)return 1;
        if(i==arr.length || target<0)return 0;
        if(dp[i][target]!=-1)return dp[i][target];
    
        int select = 0;
        if(arr[i]<=target)
             select = solve(arr,target-arr[i],0);
    
        int notselect = solve(arr,target,i+1);
        
        return dp[i][target]=select+notselect;
    }
}
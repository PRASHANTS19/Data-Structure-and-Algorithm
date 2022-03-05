class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int inc=0;
        int exc=0;
        int count[] = new int[10001];
        
        for(int i=0; i<n; i++){
            count[nums[i]]++;
        }
        
        int dp[] = new int[10001];
        dp[0] = count[0];
        dp[1] = Math.max(count[0] , count[1]);
        for(int i=2; i<10001; i++){
            dp[i] = Math.max(count[i]*i+dp[i-2] , dp[i-1]);
        }
        return dp[10000];
    }
}
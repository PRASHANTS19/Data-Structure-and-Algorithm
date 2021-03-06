class Solution {
   int aux(int[] nums, int i, int sum, int S, int[][] dp){
                if(i==nums.length){
                    if(S == sum)return 1;
                    return 0;
                }
                if(dp[i][sum+1001]!=Integer.MAX_VALUE)return dp[i][sum+1001];
                //Positive
                int pos=aux(nums,i+1,sum+nums[i],S,dp);
                //Negative
                int neg=aux(nums,i+1,sum-nums[i],S,dp);
                
                dp[i][sum+1001]=pos + neg;
                return dp[i][sum+1001];
            }
    public int findTargetSumWays(int[] nums, int S){
            int[][] dp=new int[nums.length+1][2009];
            for(int i=0;i<nums.length+1;i++){
                for(int j=0;j<2009;j++){
                    dp[i][j]=Integer.MAX_VALUE;
                }
            }
            return aux(nums,0,0,S,dp);
    }
}
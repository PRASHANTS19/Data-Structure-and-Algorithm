class Solution {
    int dp[];
    public boolean canJump(int[] arr) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        
       return solve(arr,0); 
    }
    boolean solve(int arr[],int start){
        if(start>=arr.length-1)return true;
        
        if(dp[start]!=-1)return dp[start]==0?false:true;
        
        boolean ans = false;
        for(int jump=arr[start]; jump>0; jump--){
            ans = ans||solve(arr,start+jump);
        }
        if(ans)dp[start]=1;
        else dp[start]=0;
        return ans;
    }
}
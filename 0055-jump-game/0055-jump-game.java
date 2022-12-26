class Solution {
    int dp[];
    public boolean canJump(int[] arr) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        
        return solve(arr,0);
    }
    boolean solve(int arr[],int i){
        if(i>=arr.length-1)return true;
        if(dp[i]!=-1)return dp[i]==1?true:false;
        
        boolean jump=false;
        for(int x=arr[i]; x>0; x--){
            jump = jump || solve(arr,x+i);
        }
        
        dp[i]= jump==true?1:0; 
        return jump;
    }
}
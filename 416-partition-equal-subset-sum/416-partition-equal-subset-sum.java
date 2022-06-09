class Solution {
    int dp[][];
    public boolean canPartition(int[] arr) {
        int n =arr.length;
        int sum = 0;
        for(int i : arr)
            sum += i;
        
        if(sum%2!=0)return false;
         sum = sum/2;
        
        dp = new int[n][sum+1];
        //1=>true and 0=>false
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(arr,n-1,sum);
    }
    boolean solve(int arr[],int n,int target){
        if(target==0)return true;
        if(n==0){
            if(arr[0]==target)return true;
            else return false;
        }
        if(dp[n][target]!=-1) return dp[n][target]==1?true:false;
        
        boolean notselect = solve(arr,n-1,target);
        boolean select = false;
        if(arr[n]<=target){
            select = solve(arr,n-1,target-arr[n]);
        }
        
        dp[n][target]=(select||notselect)?1:0;
        return select||notselect;
    }
}
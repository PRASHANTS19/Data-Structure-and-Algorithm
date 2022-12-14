class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        
        int dp[] = new int[n];
        
        if(n==1)return arr[0];
        if(n==2)return Math.max(arr[0],arr[1]);
        
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        
        for(int i=2; i<n; i++){
            int select = arr[i]+dp[i-2];
            int notselect = 0+dp[i-1];
            
            dp[i] = Math.max(select,notselect);
        }
        return Math.max(dp[n-1],dp[n-2]);
        
    }
    
    
    int solve(int arr[],int n){
        if(n<0)return 0;
        
        int select = arr[n]+solve(arr,n-2);
        int notselect = 0+solve(arr,n-1);
        
        return Math.max(select,notselect);
    }
}
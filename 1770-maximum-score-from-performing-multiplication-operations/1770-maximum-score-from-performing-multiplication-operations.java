class Solution {
    Integer dp[][];
    int n;
    public int maximumScore(int[] arr, int[] mul) {
         n = arr.length;
        int m = mul.length;
        
        dp = new Integer[m][m];
        
        
        return solve(0,arr.length-1,0,arr,mul);
       
    }
    int solve(int i,int j,int k,int arr[],int mul[])
    {
        if(k>=mul.length)return 0;
        if(dp[i][n-j-1]!=null)return dp[i][n-j-1];
        
        int left = arr[i]*mul[k]+solve(i+1,j,k+1,arr,mul);
        int right = arr[j]*mul[k]+solve(i,j-1,k+1,arr,mul);
        
        return dp[i][n-j-1]=Math.max(left,right);
    }
}
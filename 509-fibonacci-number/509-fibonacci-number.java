class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fibo(dp,n);
        return ans;
    }
    int fibo(int[] dp,int n){
        if(n==0)return 0;
        if(n==1)return 1;
        if(dp[n]!=-1)return dp[n];
    
    return dp[n]=fibo(dp,n-1)+fibo(dp,n-2);
    }
}
class Solution {
    int a=0, e=1, i=2, o=3, u=4, mod=(int)(1e9 + 7);
    public int countVowelPermutation(int n) {
        long[] dp=new long[5];
        long[] prev=new long[5];
        Arrays.fill(prev, 1L);
        while(n-->1){
            
            dp[a]=((prev[e]+prev[i])%mod+prev[u])%mod;
            dp[e]=(prev[a]+prev[i])%mod;
            dp[i]=(prev[e]+prev[o])%mod;
            dp[o]=(prev[i])%mod;
            dp[u]=(prev[i]+prev[o])%mod;
            
            long[] tmp = dp; 
            dp = prev; 
            prev = tmp;
        }
        
        return (int)(((prev[a]+prev[e])%mod+(prev[i]+prev[o])%mod)%mod+prev[u])%mod;
    }
}
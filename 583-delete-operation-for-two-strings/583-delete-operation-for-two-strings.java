class Solution {
    int dp[][];
    public int minDistance(String s1, String s2) {
        ///remove lcs from both of the string
        int m = s1.length();
        int n = s2.length();
        dp = new int[m][n];
        
        for(int i=0; i<m; i++)
            Arrays.fill(dp[i],-1);
        
        int lcs = lcsUtil(s1,s2,m-1,n-1,dp);
        
        int ans = m+n-2*lcs;
        
        return ans;
        
    }
    static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp){

    if(ind1<0 || ind2<0)
        return 0;
        
    if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
    
    if(s1.charAt(ind1) == s2.charAt(ind2))
        return dp[ind1][ind2] = 1 + lcsUtil(s1,s2,ind1-1,ind2-1,dp);
    
    else 
        return dp[ind1][ind2] = 0 + Math.max(lcsUtil(s1,s2,ind1,ind2-1,dp),
        lcsUtil(s1,s2,ind1-1,ind2,dp));
   
}
//     int solve(String s1,String s2,int m,int n){
//         if(m<0||n<0)return 0;
        
//         if(dp[m][n]!=-1)return dp[m][n]; 
        
//         if(s1.charAt(m)==s2.charAt(n)){
//             return dp[m][n]=1+solve(s1,s2,m-1,n-1);
//         }
//         else
//             return dp[m][n]=Math.max(solve(s1,s1,m-1,n),solve(s1,s2,m,n-1));
//     }
    
}
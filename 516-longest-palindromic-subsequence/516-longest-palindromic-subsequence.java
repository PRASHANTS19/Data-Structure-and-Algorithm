class Solution {
    int dp[][];
    public int longestPalindromeSubseq(String s) {
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();
        
        int m =s1.length();
        int n = s2.length();
        dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(s1,s2,m-1,n-1); 
    }
     int solve(String s1,String s2, int m,int n){
        if(m<0||n<0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        
        int notselect1 = 0+solve(s1,s2,m-1,n);
        int notselect2 = 0+solve(s1,s2,m,n-1);
        int select = 0;
        if(s1.charAt(m)==s2.charAt(n)){
         select = 1+solve(s1,s2,m-1,n-1);   
        }
        
        return dp[m][n]=Math.max(Math.max(notselect1,notselect2),select);
    }
}
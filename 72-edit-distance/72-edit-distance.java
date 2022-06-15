class Solution {
    int dp[][];
    public int minDistance(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();
        // dp = new int[m][n];
        // for(int i=0; i<m; i++)
        //     Arrays.fill(dp[i],-1);
        
        //for tabulation we have to follow 1base indexing as basecase is <0 which is not practical in zero base.
        dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++)
            dp[i][0]=i;
        for(int i=0; i<=n; i++)
            dp[0][i]=i;
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                int insert=(int)1e9,delete=(int)1e9,replace=(int)1e9;
        
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]= 0+dp[i-1][j-1];
                else{
                    insert =dp[i][j-1];
                    delete = dp[i-1][j];
                    replace = dp[i-1][j-1];
                    dp[i][j]=1+Math.min(insert,Math.min(delete,replace));
                }
                 
            }
        }
        return dp[m][n];
        // return solve(s1,s2,m-1,n-1);
    }
    int solve(String s1,String s2,int m,int n){
        if(m<0)return n+1;
        if(n<0)return m+1;
        if(dp[m][n]!=-1)return dp[m][n];
        
        int insert=(int)1e9,delete=(int)1e9,replace=(int)1e9;
        
        if(s1.charAt(m)==s2.charAt(n))
            return 0+solve(s1,s2,m-1,n-1);
        else{
            insert =1+solve(s1,s2,m,n-1);
            delete = 1+solve(s1,s2,m-1,n);
            replace = 1+solve(s1,s2,m-1,n-1);
        }
        return dp[m][n]=Math.min(insert,Math.min(delete,replace));
    }
}
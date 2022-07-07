class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
         int m = s1.length();
        int n = s2.length();
        int t = s3.length();
        
        if(t==0) return true;
        if(m+n != t) return false;
        else if(m==0 && n==0 && t!=0) return false;
        else if(m==0 && n!=0 )
        {
            if(s2.equals(s3))
                return true;
            else
                return false;
        }
        else if(m!=0 && n==0)
        {
            if(s1.equals(s3))
                return true;
            else
                return false;
        }
            
        
        boolean dp[][] = new boolean[m+1][n+1];
        dp[0][0] = true;
        
        //base case 1
        for(int i=1;i<=m;i++)
        {
            if((s1.substring(0,i)).equals(s3.substring(0,i)))
                dp[i][0] = true;
            else
                dp[i][0] = false;
        }

        //base case 2
        for(int j=1;j<=n;j++)
        {
            if((s2.substring(0,j)).equals(s3.substring(0,j)))
                dp[0][j] = true;
            else
                dp[0][j] = false;
        }
        
        //dp solution
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if( (dp[i-1][j]==true && s1.charAt(i-1)==s3.charAt(i+j-1)) || (dp[i][j-1]==true && s2.charAt(j-1)==s3.charAt(i+j-1)) )
                    dp[i][j] = true;
                 else
                    dp[i][j] = false;
            }
        }
        return dp[m][n]; 
    }
}
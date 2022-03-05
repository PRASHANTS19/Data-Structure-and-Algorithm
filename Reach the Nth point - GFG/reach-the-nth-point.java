// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {   int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
    
       return solve(n,dp);
    }
   static int solve(int n,int dp[]){
        if(n<=0)return 0;
        if(n<=2)return n;
        
        if(dp[n]!=-1)return dp[n];
        int x = solve(n-1,dp);
        int y = solve(n-2,dp);
        
        return dp[n]=(x+y)%1000000007;
    }
}
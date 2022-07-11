// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            System.out.println(ob.arrangeTiles(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long arrangeTiles(int N){
        // code here
        long dp[] = new long[N+1];
        
        for(int i=1; i<=N; i++){
            if(i<4)dp[i]=1;
            else if(i==4)dp[i]=2;
            else dp[i] = dp[i-1]+dp[i-4];
        }
        return dp[N];
    }
}
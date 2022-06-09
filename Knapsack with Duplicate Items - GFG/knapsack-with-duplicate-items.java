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
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int dp[][];
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        dp = new int[N+1][W+1];
        // for(int i=0; i<N; i++){
        //     Arrays.fill(dp[i],-1);
        // }
        
        for(int i=1; i<N+1; i++){
            for(int j=1; j<W+1; j++){
                
                int notselect = 0+dp[i-1][j];
                int select = 0;
                if(wt[i-1]<=j){
                    select = val[i-1]+dp[i][j-wt[i-1]];      
                }
                dp[i][j]=Math.max(select,notselect);
                
            }
        }
        
        // return solve(val,wt,W,N-1);
        return dp[N][W];
    }
    static int solve(int val[],int wt[],int W,int n){
        if(W<=0 || n<0)return 0;
        // if(n==0){
        //     if(wt[0]==W)return val[0];
        //     else return 0;
        // }
        if(dp[n][W]!=-1)return dp[n][W];
        
        int notselect = 0+solve(val,wt,W,n-1);
        int select = 0;
        if(wt[n]<=W){
            select = val[n]+solve(val,wt,W-wt[n],n);
        }
        
        return dp[n][W]=Math.max(select,notselect);
    }
}
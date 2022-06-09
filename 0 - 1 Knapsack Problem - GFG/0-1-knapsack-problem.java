// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int dp[][];
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         dp = new int[n][W+1];
         
         for(int i=wt[0]; i<=W; i++){
             dp[0][i] = val[0];
         }
         
         for(int ind=1; ind<n; ind++){
             for(int cap=0; cap<=W; cap++){
                 
                 int notselect = 0+dp[ind-1][cap];
                 int select = 0;
                    
                 if(wt[ind]<=cap){
                    select = val[ind]+dp[ind-1][cap-wt[ind]];
                }
                dp[ind][cap] = Math.max(select,notselect);
             }
         }
         
         return dp[n-1][W];
         
     
        
         
    } 
    static int solve(int value[],int weight[],int W,int n){
        // if(n<0 || W<=0)return 0;
        
        if(n==0){
            if(weight[0]<=W)return value[0];
            else return 0;
        }
        
        if(dp[W][n]!=-1)return dp[W][n];
        
        int notselect = solve(value,weight,W,n-1);
        int select = 0;
        
        if(weight[n]<=W){
            select = value[n]+solve(value,weight,W-weight[n],n-1);
        }
        return dp[W][n]=Math.max(select,notselect);
    }
}



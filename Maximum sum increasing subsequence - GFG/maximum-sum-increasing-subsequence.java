// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{   int dp[][];
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    dp = new int[n][n+1];
	    for(int i=0; i<n; i++){
	        Arrays.fill(dp[i],-1);
	    }
	    return solve(arr,n-1,-1);
	}  
	int solve(int arr[],int n,int prev_index){
	    if(n<0)return 0;
	    if(dp[n][prev_index+1]!=-1)return dp[n][prev_index+1];
	    
	    int notpick = 0+solve(arr,n-1,prev_index);
	    int pick = 0;
	    if(prev_index==-1||arr[n]<arr[prev_index]){
	        pick = arr[n]+solve(arr,n-1,n);
	    }
	    
	    return dp[n][prev_index+1]=Math.max(pick,notpick);
	}
}
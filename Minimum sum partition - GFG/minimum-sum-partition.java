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
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{   int sum = 0;
	    for(int i=0; i<n; i++){
	        sum+= arr[i];
	    }
	   ArrayList<Integer> list = new ArrayList<>();
	   list = subsetsum(arr,n,sum,list);
	   
	   int min = Integer.MAX_VALUE;
	   for(int i=0; i<list.size(); i++){
	       min = Math.min(min , sum-2*list.get(i));
	   }
	    return min;
	} 
	ArrayList<Integer> subsetsum(int arr[] , int n, int sum,ArrayList<Integer> list){
	    boolean dp[][] = new boolean[n+1][sum+1];
	    for(int i=0; i<=n; i++){
	        dp[i][0] =true;
	    }
	     for(int i=1; i<=n; i++){
	        for(int j=1; j<=sum; j++){
	            if(j<arr[i-1]){
	                dp[i][j]=dp[i-1][j];
	            }
	            else if(j>=arr[i-1]){
	                dp[i][j] = (dp[i-1][j-arr[i-1]] || dp[i-1][j]);
	            }
	        }
	    }
	    for(int i=0; i<=sum/2; i++){
	        if(dp[n][i]){
	            list.add(i);
	        }
	    }
	    return list;
	}
	
}

// { Driver Code Starts


import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    int dp[][];
    public int cutRod(int price[], int n) {
        //code here
        dp = new int[n][n+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(price,n,n-1);
    }
    int solve(int arr[],int size,int ind){
        
        if(ind==0){
            return (size/(ind+1))*arr[0];
        }
        if(dp[ind][size]!=-1)return dp[ind][size];
        
        int notselect = solve(arr,size,ind-1);
        int select  = Integer.MIN_VALUE;
        if((size-ind-1)>=0){
            select = arr[ind]+solve(arr,size-ind-1,ind);
        }
        
        return dp[ind][size]=Math.max(select,notselect);
    }
}
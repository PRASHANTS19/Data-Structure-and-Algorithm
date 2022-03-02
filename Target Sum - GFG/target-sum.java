// { Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++){
                A[i] = Integer.parseInt(S[i]);
            }
            int target = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findTargetSumWays(A,N, target));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findTargetSumWays(int[] arr , int n, int target) {
        int arrsum = 0;
        for(int x : arr)arrsum+=x;
        
        int sum = target+arrsum;
        if(sum%2!=0)return 0;
        
         sum = sum/2;
         return solve(arr,n-1,sum);
    }
    static int solve(int arr[],int n,int target){
        
       if(target==0)return 1;
       if(n==0){
           if(arr[0]==target)return 1;
           else return 0;
       }
       int notpick = solve(arr,n-1,target);
       int pick = 0;
       if(target>=arr[n]){
           pick = solve(arr,n-1,target-arr[n]);
       }
       return pick+notpick;
    }
}
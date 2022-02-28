// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    // static boolean dp[][] = new boolean[1002][1002];
    static Boolean isSubsetSum(int n, int arr[], int k){
        boolean dp[][] = new boolean[n][k+1];
        
       for(int i=0; i<n; i++){
           dp[i][0]=true;
       }
        if(arr[0]<=k)
            dp[0][arr[0]] = true;
        
       for(int ind=1; ind<n; ind++){
           for(int target=1; target<=k; target++){
               
               boolean nottaken = dp[ind-1][target];
               boolean taken = false;
               if(arr[ind]<=target){
                   taken = dp[ind-1][target-arr[ind]];
               }
               dp[ind][target]=taken||nottaken;
           }
       }
       return dp[n-1][k];
    }
}
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
        int dp[][] = new int[n][k+1];
        for(int x[] : dp){
            Arrays.fill(x,-1);
        }
       return solve(n-1,k,arr,dp);
        
    }
    
    static boolean solve(int n,int target,int arr[],int dp[][]){
        if(target==0)return true;
        if(n==0)return arr[0]==target;
        
        if(dp[n][target]!=-1)return dp[n][target]==0?false:true;
        
        boolean taken=false;
        boolean nottaken = solve(n-1,target,arr,dp);
        if(target>=arr[n]){
            taken = solve(n-1,target-arr[n],arr,dp);
        }
        
        dp[n][target]=taken||nottaken?1:0;
        return taken||nottaken;
    }
}
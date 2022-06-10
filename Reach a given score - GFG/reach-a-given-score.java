// { Driver Code Starts
// Driver Code
import static java.lang.System.out;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-->0;) {
            int n = in.nextInt();
            
            Geeks obj = new Geeks();
            out.println(obj.count(n));
        }
    }
}// } Driver Code Ends


// Complete this function!

class Geeks {
    static long dp[][];
    public long count(int n) {
        dp= new long[3][(int)n+1];
        
        for(int i=0; i<3; i++){
            Arrays.fill(dp[i], -1);
        }
        
        // Add your code here.
        int arr[] = {3,5,10};
        return solve(arr,n,2);
        
        // return dp[n];
    }
    static long solve(int arr[],int target,int n){
        // if(target<0)return 0;
        // if(target==0)return 1;
        if(n==0){
            if(target%arr[0]==0)return 1;
            else return 0;
        }
        
        if(dp[n][target]!=-1)return (int)dp[n][target];
        
        long notselect = solve(arr,target,n-1);
        long select =  0;
        if(target>=arr[n]){
            select = solve(arr,target-arr[n],n);
        }
        return dp[n][target]=select+notselect;
    }
}
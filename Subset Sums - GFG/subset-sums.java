// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       ArrayList<Integer> list = new ArrayList<>();
       solve(arr,N-1,0,list);
       Collections.sort(list);
       return list;
       
       
    }
    void solve(ArrayList<Integer> arr,int n,int sum,ArrayList<Integer> list){
        if(n<0){
            list.add(sum);
            return;
        }
        
        solve(arr,n-1,sum+arr.get(n),list);
        solve(arr,n-1,sum,list);
    }
}
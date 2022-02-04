// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int NthRoot(int n, int m)
    {
        if(m==0)return 0;
        long l=0; long r=m;
        long res=0;
        while(l<=r){
            long mid = l+(r-l)/2;
            long mul = (long)Math.pow(mid,n);
            if(mul==m)return (int)mid;
            else if(mul<=m){
                res =mid;
                l = mid+1;
            }
            else r=mid-1;
        }
        return -1;
    }
}
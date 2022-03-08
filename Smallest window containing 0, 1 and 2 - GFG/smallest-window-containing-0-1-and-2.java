// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String s) {
       int n = s.length();
       int i=0;
       int j=0;
       int min = Integer.MAX_VALUE;
       int arr[] = new int[3];
       
       while(j<n){
           if(s.charAt(j)=='0')arr[0]++;
           else if(s.charAt(j)=='1')arr[1]++;
           else if(s.charAt(j)=='2')arr[2]++;
          
           while(i<j && arr[0]>=1 && arr[1]>=1 && arr[2]>=1){
               min = Math.min(min,j-i+1);
               int x = s.charAt(i)-'0';
               arr[x]--;
               i++;
           }
           j++;
       }
       if(min==Integer.MAX_VALUE)return -1;
       return min;
       
    }
}

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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.brainGame(nums);
            if(ans)
                System.out.println("A");
            else 
                System.out.println("B");     
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean brainGame(int[] nums)
    {
        // Code here
        int ans = 0;
        for(int x : nums){
            if(!isPrime(x)) ans = ans^(countFactor(x)-1);
        }
        return ans!=0;
        
    }
    boolean isPrime(int num){
        
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)return false;
        }
        return true;
    }
    int countFactor(int num){
        
        int n = num; int count= 0;
        for(int i=2; i<=num/2; i++){
            
            while(n%i==0){
                count++;
                n = n/i;
            }
        }
        return count;
    }
}
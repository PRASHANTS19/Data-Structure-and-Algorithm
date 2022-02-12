// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String str)
    {
        String arr[] = str.split("\\.");
        
        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            // String res = "";
            int index = -1;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)!='0'){
                    index = j;
                    break;
                } 
            }
            if(index == -1)arr[i]="0";
            else{
                arr[i]=s.substring(index);
            }
        }
        String res = "";
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                res += arr[i];
            }
            else res += arr[i]+".";
        }
        return res;
    }
}
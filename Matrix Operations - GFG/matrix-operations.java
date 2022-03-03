// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

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
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
       int x =arr.length;
       int y = arr[0].length;
        int res[] = new int[2];
        
        int i=0,j=0,dir=0;
        while(i>=0 && j >=0 && i<x && j<y){
            res[0]=i; res[1]=j;
            if(arr[i][j]==0){
                if(dir==0)j++;
                else if(dir==1)i++;
                else if(dir==2)j--;
                else if(dir==3)i--;
            }
            else{
                arr[i][j]=0;
                if(dir==0){
                    dir=1;
                    i++;
                }
                else if(dir==1){
                    dir=2;
                    j--;
                }
                else if(dir==2){
                    dir=3;
                    i--;
                }
                else if(dir==3){
                    dir=0;
                    j++;
                }
            }
        }
        return res;
    }
}
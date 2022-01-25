// { Driver Code Starts
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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    public boolean isWordExist(char[][] arr, String str)
    {
      int m = arr.length; int n = arr[0].length;
      boolean visited[][] = new boolean[m][n];  
       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               if(arr[i][j]==str.charAt(0)){
                   if(dfs(arr,i,j,m,n,str,0))return true;
               }
           }
       }
       return false;
    }
    boolean dfs(char arr[][],int i,int j,int m,int n,String str,int k){
        if(k==str.length())return true;
        if(i<0||j<0||i>=m||j>=n)return false;
        if(arr[i][j]!=str.charAt(k))return false;
        
        if(arr[i][j]==str.charAt(k)){
           char temp = arr[i][j];
            arr[i][j]='#';
            boolean a= dfs(arr,i+1,j,m,n,str,1+k);
            boolean b= dfs(arr,i-1,j,m,n,str,1+k);
            boolean c= dfs(arr,i,j+1,m,n,str,1+k); 
            boolean d= dfs(arr,i,j-1,m,n,str,1+k);
            arr[i][j] = temp;
    
         return a||b||c||d;  
        }
        else return false;
    }
}
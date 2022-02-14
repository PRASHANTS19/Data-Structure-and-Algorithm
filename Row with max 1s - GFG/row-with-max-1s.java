// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int i=n-1,j=m-1;
        int index = 0;
        
        while(i>=0 && j>=0){
            if(arr[i][j]==1){
                if(j!=0 && arr[i][j-1]==0){
                    index = i;
                    i--;
                }   
                else if(j==0 && arr[i][j]==1){
                    index = i;
                    i--;
                }
                else{
                    j--;
                }
            }    
            else{
                i--;
            }
        }
        if(index == 0 && arr[0][m-1]==0)return -1;
        return index;
    }
}
// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] arr, int n) {
        ArrayList<String> res = new ArrayList<>();
        boolean visited[][] = new boolean[n][n];
        solve(arr,0,0,n-1,res,new ArrayList<Character>(),"",visited);
        Collections.sort(res);
        return res;
    }
    static void solve(int arr[][],int i,int j,int n,ArrayList<String>res,ArrayList<Character> list,String s,boolean visited[][]){
        if(i>n || j>n || j<0 || i<0||arr[i][j]==0||visited[i][j]==true)return;
        if(i==n && j==n){
            res.add(new String(s));
            return;
        }
        visited[i][j] = true;
        solve(arr,i+1,j,n,res,list,s+"D",visited);
        solve(arr,i-1,j,n,res,list,s+"U",visited);
        solve(arr,i,j+1,n,res,list,s+"R",visited);
        solve(arr,i,j-1,n,res,list,s+"L",visited);
        visited[i][j] = false;
    }
    
}
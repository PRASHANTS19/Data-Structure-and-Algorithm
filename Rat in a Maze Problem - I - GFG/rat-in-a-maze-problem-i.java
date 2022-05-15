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
        
        boolean visited[][] = new boolean[n][n];
        ArrayList<String> list = new ArrayList<>();
        
        solve(arr,n,0,0,visited,"",list);
        Collections.sort(list);
        return list;
        
    }
    static void solve(int[][] arr,int n,int i,int j,boolean visited[][],String res,ArrayList<String>list){
        if(i<0 || j<0 || i>=n|| j>=n||arr[i][j]==0||visited[i][j]==true)return;
        
        if(i==n-1 && j==n-1){
            list.add(new String(res));
            return;
        }
    
            visited[i][j]=true;
            solve(arr,n,i+1,j,visited,res+"D",list);
            solve(arr,n,i-1,j,visited,res+"U",list);
            solve(arr,n,i,j+1,visited,res+"R",list);
            solve(arr,n,i,j-1,visited,res+"L",list);
            visited[i][j]=false;
        
    }
}
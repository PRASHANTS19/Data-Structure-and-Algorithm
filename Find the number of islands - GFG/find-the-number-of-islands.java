// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
       public int numIslands(char[][] grid) {
        
        int c = 0;
        int vis[][] = new int[501][501];
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && grid[i][j]=='1' ){
                    dfs(i,j,vis,grid,n,m );
                    c++;
                }
            }
        }
        return c;
    }
    void dfs(int i, int j, int[][]visi , char[][]grid , int n, int m){
        if(i<0 || j<0 || i>=n || j>=m) return;
        if(grid[i][j]=='0') return;
        
        if(visi[i][j] == 0){
            visi[i][j]=1;
            dfs(i+1 , j , visi , grid , n , m);
            dfs(i-1 , j , visi , grid , n , m);
            dfs(i , j+1 , visi , grid , n , m);
            dfs(i , j-1 , visi , grid , n , m);
            dfs(i+1 , j+1 , visi , grid , n , m);
            dfs(i-1 , j-1 , visi , grid , n , m);
            dfs(i+1 , j-1 , visi , grid , n , m);
            dfs(i-1 , j+1 , visi , grid , n , m);
        }
    }
}
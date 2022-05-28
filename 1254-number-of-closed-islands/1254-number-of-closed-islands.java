class Solution {
    public int closedIsland(int[][] arr) {
        int m  = arr.length;
        int n = arr[0].length;
        boolean visited[][] = new boolean[m][n];
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0&&visited[i][j]==false){
                   if(dfs(arr,i,j,m,n,visited))ans++;
                }
            }
        }
        return ans;
    }
    boolean dfs(int arr[][],int i,int j,int m,int n,boolean visited[][]){
        if(i>=m||j>=n||i<0||j<0)return false;
        if(arr[i][j]==1||visited[i][j])return true;
        
        visited[i][j]=true;
        boolean a = dfs(arr,i+1,j,m,n,visited);
        boolean b = dfs(arr,i,j+1,m,n,visited);
        boolean c = dfs(arr,i,j-1,m,n,visited);
        boolean d = dfs(arr,i-1,j,m,n,visited);
        
        return a&&b&&c&&d;
    }
}
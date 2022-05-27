class Solution {
    public int[][] floodFill(int[][] arr, int i, int j, int newColor) {
        int n = arr.length;
        int m = arr[0].length;
        boolean visited[][] = new boolean[n][m];
        int src = arr[i][j];
        dfs(arr,src,i,j,n,m,newColor,visited);
        
        return arr;
    }
void dfs(int[][] arr,int src,int i,int j,int n,int m,int newColor,boolean[][]visited){
        if(i<0 || j<0 || i>=n || j>=m)return;
        if(src!=0 && arr[i][j]==0) return;
        
        if( arr[i][j]==src && visited[i][j]==false){
          arr[i][j]=newColor;
          visited[i][j]=true;
        dfs(arr,src,i+1,j,n,m,newColor,visited);
        dfs(arr,src,i-1,j,n,m,newColor,visited);
        dfs(arr,src,i,j+1,n,m,newColor,visited);
        dfs(arr,src,i,j-1,n,m,newColor,visited);
        }
    }
}
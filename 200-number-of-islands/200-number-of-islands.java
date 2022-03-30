class Solution {
    public int numIslands(char[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        
        boolean visited[][] = new boolean[r][c];
        int count = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j]=='1' && visited[i][j]==false){
                    dfs(arr,visited,i,j,r,c);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(char[][] arr,boolean visited[][],int i,int j,int r,int c){
        if(i<0||j<0||i>=r||j>=c||arr[i][j]=='0')return;
        
        if(arr[i][j]=='1' && visited[i][j]==false){
            visited[i][j]=true;
            dfs(arr,visited,i+1,j,r,c);
            dfs(arr,visited,i,j+1,r,c);
            dfs(arr,visited,i-1,j,r,c);
            dfs(arr,visited,i,j-1,r,c);
        }
    }
}
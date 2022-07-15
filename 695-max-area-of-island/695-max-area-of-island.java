class Solution {
    public int maxAreaOfIsland(int[][] arr) {
        
        int m = arr.length;
        int n =arr[0].length;
        int max = 0;
        boolean visited[][] = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j]==false && arr[i][j]==1){
                    max = Math.max(solve(arr,visited,i,j),max);
                }
            }
        }
        return max;
        
    }
    int solve(int arr[][],boolean visited[][],int ii,int jj){
        Queue<int[]> q = new LinkedList<>();
        
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        q.add(new int[]{ii,jj});
         visited[ii][jj]=true;
        int count = 0;
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int i=0; i<s; i++){
                
                int[] temp = q.remove();
                count++;
                int x = temp[0];
                int y = temp[1];
                
                for(int j=0; j<4; j++){
                    int xx = x+dir[j][0];
                    int yy = y+dir[j][1];
                    if(xx<0||yy<0||xx>=arr.length||yy>=arr[0].length||visited[xx][yy]==true||arr[xx][yy]==0)
                        continue;
                    visited[xx][yy]=true;
                    q.add(new int[]{xx,yy});
                }
            }
        }
        return count;
    }
}
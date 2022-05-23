class Solution {
    public int numIslands(char[][]arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean visited[][] = new boolean[m][n];
        int res = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]=='1' && visited[i][j]==false)
                {
                    bfs(arr,i,j,m,n,visited);
                    res++;
                }
            }
        }
        return res;
    }
    
    void bfs(char[][] arr,int i,int j,int m,int n,boolean visited[][]){
        if(i>=m||j>=n||i<0||j<0||visited[i][j]==true||arr[i][j]=='0')return;
        
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        
        Queue<int[]>q = new LinkedList<>();
        q.add(new int[]{i,j});
        
        visited[i][j]=true;
        
        int count = 0;
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int k=0; k<size; k++)
            {
                int[] temp = q.remove();
                int x = temp[0];
                int y = temp[1];
                
                for(int l=0; l<4; l++){
                    int nextx = x+dir[l][0];
                    int nexty = y+dir[l][1];
                    if(nextx>=m||nexty>=n||nextx<0||nexty<0||visited[nextx][nexty]==true||arr[nextx][nexty]=='0')continue;
                    else {
                        visited[nextx][nexty]=true;
                        q.add(new int[]{nextx,nexty});
                    }
                }
            }
        }
        
        
    }
}
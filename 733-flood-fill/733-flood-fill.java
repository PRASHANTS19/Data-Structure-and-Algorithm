class Solution {
    public int[][] floodFill(int[][] arr, int i, int j, int newColor) {
        int m = arr.length;
        int n = arr[0].length;
        
        int color = arr[i][j];
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        boolean visited[][] = new boolean[m][n];
        visited[i][j]=true;
        
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int k=0; k<size; k++){
                int[] temp = q.remove();
                int x = temp[0];
                int y = temp[1];
                arr[x][y]=newColor;
                visited[x][y]=true;
                for(int v=0; v<4; v++){
                    int nextx = x+dir[v][0];
                    int nexty = y+dir[v][1];
                    
                    if(nextx<0||nextx>=m||nexty<0||nexty>=n||visited[nextx][nexty])continue;
                    else{
                        if(arr[nextx][nexty]==color)
                            q.add(new int[]{nextx,nexty});
                    }
                }
            }
        }
        return arr;
        
    }
}
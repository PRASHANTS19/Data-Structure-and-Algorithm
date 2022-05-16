class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int m = grid.length;
        int n = m;
        
        if(grid[0][0]!=0 || grid[m-1][n-1]!=0)return -1;
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,1},{-1,-1},{1,-1}};
        
        boolean visited[][] = new boolean[m][n];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        int res = 0;
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] pop = q.remove();
                
                if(pop[0]==m-1 && pop[1]==n-1)
                    return res+1;
                
                for(int k=0; k<8; k++){
                    int nextX = pop[0]+dir[k][0];
                    int nextY = pop[1]+dir[k][1];
                    
                    if(nextX>=0&&nextY>=0&&nextX<m&&nextY<n&&grid[nextX][nextY]==0 && visited[nextX][nextY]==false){
                        q.add(new int[]{nextX,nextY});
                        visited[nextX][nextY]=true;
                    }
                    
                 }
            }
            res++;
        }
        return -1;
    }
}
class Solution {
    public int orangesRotting(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dir[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==2)q.add(new int[]{i,j});
            }
        }
        int minutes = 0;
        
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int i=0; i<size; i++){
                int cor[] = q.remove();
                int xx = cor[0];
                int yy = cor[1];
                
                for(int j=0; j<4; j++){
                    int nextxx = xx+dir[j][0];
                    int nextyy = yy+dir[j][1];
                    
                    if(nextxx>=m||nextyy>=n||nextxx<0||nextyy<0||arr[nextxx][nextyy]==0||arr[nextxx][nextyy]==2)continue;
                    else{
                        q.add(new int[]{nextxx,nextyy});
                        arr[nextxx][nextyy] = 2;
                    }
                }  
            }
            minutes++;
        }
         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1)return -1;
            }
        }
        if(minutes==0)return 0;
        return minutes-1;
    }
}
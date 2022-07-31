class Solution {
    
    public int shortestPathBinaryMatrix(int[][] arr) {
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        int n = arr.length;
        if(arr[0][0]==1 || arr[n-1][n-1]==1)return -1;
        Queue<int[]>q = new LinkedList<>();
        boolean visited[][] = new boolean[n][n];
        q.add(new int[]{0,0});
        visited[0][0]=true;
        int count = 0;
        boolean found = false;
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int i=0; i<s; i++){
                int x = q.peek()[0];
                int y = q.peek()[1];
                q.remove();
                if(x==n-1 && y==n-1){
                    found=true;
                    break;
                }
                for(int ii=0; ii<8; ii++){
                    int xx = x+dir[ii][0];
                    int yy = y+dir[ii][1];
                    
                    if(xx<0||yy<0||xx>=n||yy>=n||visited[xx][yy]==true||arr[xx][yy]==1)continue;
                    q.add(new int[]{xx,yy});
                    visited[xx][yy]=true;
                }
            }
            
            count++;
            if(found)break;
        }
        if(found==false)return -1;
        return count;
        
    }
}
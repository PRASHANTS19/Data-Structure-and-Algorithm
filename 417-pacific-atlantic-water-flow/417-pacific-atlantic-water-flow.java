class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] arr) {
        List<List<Integer>> matrix = new ArrayList<>();
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                bfs(arr,i,j,matrix);
            }
        }
        return matrix;
    }
    static int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    
    void bfs(int[][] arr,int i,int j,List<List<Integer>>matrix){
        int r = arr.length;
        int c = arr[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[201][201];
        
        q.add(new int[]{i,j});
        visited[i][j]=true;
        
        boolean p=false,a=false;
        
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int ii=0; ii<s; ii++){
                int temp[] = q.remove();
                int x = temp[0],y=temp[1];
                
                if((x==0&&y==c-1)||(x==r-1&&y==0)|| r==1 || c==1){
                    matrix.add(new ArrayList<>());
                    matrix.get(matrix.size()-1).add(i);
                    matrix.get(matrix.size()-1).add(j);
                    return;
                }
                else if(x==0 || y==0){
                    p=true;
                }
                else if(x==r-1 || y==c-1 ){
                    a=true;
                }
                if(p==true && a==true){
                    break;
                }
                
                for(int jj=0; jj<4; jj++){
                    int nextx = dir[jj][0]+temp[0];
                    int nexty = dir[jj][1]+temp[1];
                    if(nextx<0||nexty<0||nextx>=r||nexty>=c||visited[nextx][nexty])continue;
                    else if(arr[nextx][nexty]<=arr[x][y]){
                        visited[nextx][nexty]=true;
                        q.add(new int[]{nextx,nexty});
                    }
                }
            }
            if(p==true && a==true){
                    break;
            }
        }
        if(p==true && a==true){
            matrix.add(new ArrayList<>());
            matrix.get(matrix.size()-1).add(i);
            matrix.get(matrix.size()-1).add(j);
            return;
        }
    }
}
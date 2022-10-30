class Solution {
    int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    public int shortestPath(int[][] arr, int k) {
        int m = arr.length;
        int n=arr[0].length;
        return solve(arr,m,n,k);
    }
    int solve(int arr[][],int m,int n,int k){
        Queue<int[]>q = new LinkedList<>();
        q.add(new int[]{0,0,k});
        boolean visited[][][]=new boolean[m][n][k+1];
        visited[0][0][k]=true;
        
        int steps=0;
        int ans= (int)1e9;
        
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int ii=0; ii<s; ii++){
                int temp[] = q.remove();
                
                if(temp[0]==m-1 && temp[1]==n-1){
                    ans = Math.min(ans,steps);
                    visited[m-1][n-1][k]=false;
                }
                for(int i=0; i<4; i++){
                    int x=temp[0],y=temp[1];
                    int nextx=x+dir[i][0];
                    int nexty=y+dir[i][1];
                    if(nextx<0||nexty<0||nextx>=m||nexty>=n||visited[nextx][nexty][temp[2]])continue;
                    else{
                        if(arr[nextx][nexty]==1 && temp[2]>0){
                            q.add(new int[]{nextx,nexty,temp[2]-1});
                            visited[nextx][nexty][temp[2]]=true;
                        }
                        else if(arr[nextx][nexty]==0){
                            q.add(new int[]{nextx,nexty,temp[2]});
                            visited[nextx][nexty][temp[2]]=true;
                        }
                    }
                }
            }
            steps++;
        }
        
        return ans>=(int)1e9?-1:ans;
    }
    
}
class Solution {
    public int maxDistance(int[][] arr) {
        int n = arr.length;
        
        int one = 0;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.size()==0 || q.size()==n*n)return -1;

        return solve(arr,q)-1;
    }
    int solve(int arr[][],Queue<int[]> q){
        int r = arr.length;
        int ans =0;
        
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};

        // boolean visited[][] = new boolean[r][r];
        
        
        while(q.isEmpty()!=true){
            int s = q.size();
            for(int ii=0; ii<s; ii++){
                int temp[] = q.remove();
                
                for(int d[] : dir){
                    int nx = temp[0]+d[0];
                    int ny = temp[1]+d[1];
                    
                    if(nx<0||ny<0||nx>=r||ny>=r||arr[nx][ny]==1)continue;
                    arr[nx][ny]=1;
                    q.add(new int[]{nx,ny});
                }
            }
            ans++;
        }
        return ans;
    }
}
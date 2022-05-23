class Solution {
    public boolean isBipartite(int[][] arr) {
        int m = arr.length;
        
        boolean visited[] = new boolean[m];
        int color[] = new int[m];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<arr[i].length; j++)
            {if(visited[arr[i][j]]==false)
                if(bfs(arr,visited,color,i,j)==false)return false;
            }
        }
        return true;
        
    }
    boolean bfs(int arr[][],boolean visited[],int color[],int m,int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(arr[m][n]);
        color[arr[m][n]] = 1;
        visited[arr[m][n]]=true;
        
        while(q.isEmpty()!=true){
            int size = q.size();
            for(int i=0; i<size; i++){
                int temp = q.remove();
                for(int x : arr[temp]){
                    if(visited[x]==false){
                        q.add(x);
                        color[x]=1-color[temp];
                        visited[x]=true;
                    }
                    else{
                        if(color[x]==color[temp])return false;
                    }
                }
            }
        }
        return true;
    }
}
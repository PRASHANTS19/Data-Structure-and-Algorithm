class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        boolean visited[] = new boolean[V];
        int color[] = new int[V];
        Arrays.fill(color,-1);
        
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                color[i]=0;
                if(dfs(graph,i,visited,color)==false)return false;
            }
        }
        return true;
    }
    boolean dfs(int[][] graph,int start,boolean visited[],int color[]){
        visited[start]=true;
        
        for(int u : graph[start]){
            if(visited[u]==false){
                color[u]=1-color[start];
                if(dfs(graph,u,visited,color)==false)return false;
            }
            else if(color[u]==color[start])return false;
        }
        return true;
    }
}
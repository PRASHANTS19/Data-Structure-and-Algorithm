class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        boolean visited[] = new boolean[V];
        int color[] = new int[V];
        Arrays.fill(color,-1);
        
        for(int i=0; i<V; i++){
            if(visited[i]==false)
                if(bfs(graph,i,visited,color)==false)return false;
        }
        
        return true;
    }
    boolean bfs(int[][] graph,int start,boolean visited[],int color[]){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        visited[start]=true;
        int c = 0;
        color[start]=0;
        while(q.isEmpty()!=true){
            int vis = q.remove();
            
            for(int u:graph[vis]){
                if(visited[u]==false){
                    q.add(u);
                    visited[u]=true;
                    color[u]=1-color[vis];
                }
                else if(color[u]==color[vis])return false;
            }
        }
        return true;
    }
}

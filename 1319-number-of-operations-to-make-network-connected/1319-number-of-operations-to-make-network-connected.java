class Solution {
    public int makeConnected(int n, int[][] connections) {
     if(connections.length<n-1)return -1;
        
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0; i<connections.length; i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);    
        }
        
        boolean visited[] = new boolean[n];
        int components = 0;
        for(int i=0; i<n; i++){
            if(visited[i]==false){
                solve(adj,visited,i);
                components++;
            }
        }
        return components-1;
        
    }
    void solve(ArrayList<ArrayList<Integer>>adj,boolean visited[],int start){
        visited[start]=true;
        
        for(int x : adj.get(start)){
            if(visited[x]==false){
                solve(adj,visited,x);
            }
        }
    }
}
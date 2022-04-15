class Solution {
    public boolean canFinish(int numCourses, int[][] arr) {
         if(numCourses == 0 || arr == null || arr.length == 0) return true; 
        int n = arr.length;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<arr.length; i++){
            adj.get(arr[i][1]).add(arr[i][0]);
        }
        
        /////////////////////////////////////////////////
       int V = numCourses;
       boolean visited[] = new boolean[V];
        boolean dfsvis[] = new boolean[V];
        
        
        for(int i=0; i<V; i++){
            if(visited[i]==false){
                if(dfs(i,adj,visited,dfsvis))return false;
            }
            else if((visited[i]==true && dfsvis[i]==true))return false;
        }
        return true;
    }
        
       boolean dfs( int start,ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean dfsvis[]){
           visited[start]=true;
           dfsvis[start]=true;
           for(int u : adj.get(start)){
               if(visited[u]==false){    
                   dfs(u,adj,visited,dfsvis);    
               }
               else if(visited[u]==true && dfsvis[u]==true)return true;
           }
           dfsvis[start]=false;
           return false;
       }
       
    }
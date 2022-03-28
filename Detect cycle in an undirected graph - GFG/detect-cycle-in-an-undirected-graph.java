// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[i]==false)
                if(cycle(adj,i,visited))return true;
        }
        return false;
    }
    boolean cycle(ArrayList<ArrayList<Integer>> adj,int start,boolean visited[]){
        
        Queue<node> q = new LinkedList<>();
        q.add(new node(start,-1));
        visited[start]=true;
        
        while(q.isEmpty()!=true){
            int vis = q.peek().value;
            int par = q.peek().par;
            
            q.remove();
            
            for(int u : adj.get(vis)){
                if(visited[u]==false){
                    q.add(new node(u,vis));
                    visited[u] = true;
                }
                else if(par!=u)return true; //if it is visited means it will be its parent
            }
        }
        return false;
    }
}
class node{
    int value;
    int par;
    
    node(int v,int p){
        value=v;
        par=p;
    }
}
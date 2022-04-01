// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        PriorityQueue<pair> pq = new PriorityQueue<>((p,q)->(p.weight-q.weight));
        boolean visited[] = new boolean[V];
        boolean vis[] = new boolean[V];
        // Arrays.fill(res,(int)1e8);
        
        pq.add(new pair(0,0));
        int res = 0;
        
        while(pq.isEmpty()!=true){
            int weight = pq.peek().weight;
            int val = pq.peek().value;
            pq.remove();
            if(vis[val]==true)continue;
            vis[val]=true;
            res += weight;
            
            for(ArrayList<Integer>list : adj.get(val)){
                int node = list.get(0);
                int dis  = list.get(1);
                if(vis[node]==false){
                    pq.add(new pair(dis,node));
                }
                
            }
        }
        
        return res;
        
    }
}
class pair{
    int weight;
    int value;
    
    pair(int w,int v){
        weight = w;
        value = v;
    }
}

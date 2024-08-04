class Solution {
    boolean vis[];
    int dp[];
    public int[] shortestDistanceAfterQueries(int n, int[][] qq) {
        int ans[] = new int[qq.length];
        vis = new boolean[n];
        dp = new int[n];
        Arrays.fill(dp,(int)1e9);
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<n-1; i++){
            map.put(i,new ArrayList<>());
            map.get(i).add(i+1);
        }
        map.put(n-1, new ArrayList<>());
        int ind = 0;        
        for(int i[] : qq ){
            map.get(i[0]).add(i[1]);            
            ans[ind++] = bfs(map,n);
        }
        return ans;
    }
    int bfs(HashMap<Integer,List<Integer>> map, int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        int dis[] = new int[n];
        Arrays.fill(dis,(int)1e9);
        dis[0]=0;
        
        while(q.isEmpty()!=true){
            int node= q.remove();
            
            for(int nei : map.get(node)){
                if(dis[nei]>dis[node]+1){
                    dis[nei] = dis[node]+1;
                    q.add(nei);
                }
            }
        }
        return dis[n-1];
    }
    
    
    
    
    
    
    
    int solve(HashMap<Integer,List<Integer>> map, int start, int n){
        if(start == n-1)return 0;
        if(dp[start]!=(int)1e9)return dp[start];
        // vis[start] = true;
        int min = 0;
        for(int neighbour : map.get(start)){
            min = solve(map,neighbour, n)+1;
        }
        // vis[start] = false;
        return dp[start]=Math.min(dp[start],min);
        // return min;
    }
}
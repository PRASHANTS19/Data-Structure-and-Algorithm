class Solution {
    int mod = (int)1e9+7;
    public int countPaths(int n, int[][] roads) {
        
        ArrayList<ArrayList<int[]>>adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        
        
        for(int i=0; i<roads.length; i++){
            adj.get(roads[i][0]).add(new int[]{roads[i][1],roads[i][2]});
            adj.get(roads[i][1]).add(new int[]{roads[i][0],roads[i][2]});
        }
     PriorityQueue<int[]> pq = new PriorityQueue<>((p,q)->p[1]-q[1]);
        pq.add(new int[]{0,0});
        
        int dis[] = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0] = 0;
        
        int ways[] = new int[n];
        ways[0]=1;
        
        while(pq.isEmpty()!=true){
            int s = pq.size();
            for(int i=0; i<s; i++){
                int temp[] = pq.remove();
                
                for(int x[] : adj.get(temp[0])){
                    if(dis[x[0]]>temp[1]+x[1]){
                        ways[x[0]]=ways[temp[0]];
                        dis[x[0]]=temp[1]+x[1];
                        pq.add(new int[]{x[0],temp[1]+x[1]});
                            
                    }
                    else if(dis[x[0]]==temp[1]+x[1]){
                        ways[x[0]] = (ways[temp[0]]+ways[x[0]])%mod;
                    }
                }
            }
        }
        
        return ways[n-1]%mod;
        
    }
}

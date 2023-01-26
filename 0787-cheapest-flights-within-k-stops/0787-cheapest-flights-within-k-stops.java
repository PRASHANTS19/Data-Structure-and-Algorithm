class Solution {
   
    int dp[][];
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        
        dp = new int[101][101];
        
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i[] : flights){
            adj.get(i[0]).add(new int[]{i[1],i[2]});
        }
        
         int min = solve(adj,src,dst,k,new boolean[n]);
        
        
        return min==1000000000?-1:min;
        
    }
    int solve(ArrayList<ArrayList<int[]>> adj,int s,int d,int k,boolean visited[]){
        if(s==d){
            return 0;
        }
        if(k<0)return (int)1e9;
        if(dp[s][k]!=-1)return dp[s][k];
        
        int x = (int)1e9;
        for(int[] i : adj.get(s)){
                x=  Math.min(x,i[1]+solve(adj,i[0],d,k-1,visited));
        }
        return  dp[s][k]=x;   
    }
}
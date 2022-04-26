class Solution {
    public int minCostConnectPoints(int[][] points) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        
        pq.add(new int[]{0,0,0});
        
        HashSet<Integer> visited = new HashSet<>();
        
        int cost = 0;
        int num = points.length;
        while(pq.isEmpty()!=true && visited.size()<num){
            int[] arr = pq.remove();
            int start = arr[0];
            int end = arr[1];
            int weight = arr[2];
            
            if(visited.contains(end))continue;
            
            cost += weight;
            visited.add(end);
            for(int i=0; i<num; i++){
                if(visited.contains(i)!=true){
                    pq.add(new int[]{end,i,findWeight(points,end,i)});
                }
            }
        }
        return cost;
    }
    int findWeight(int[][]points,int i,int j){
        return Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
    }
}



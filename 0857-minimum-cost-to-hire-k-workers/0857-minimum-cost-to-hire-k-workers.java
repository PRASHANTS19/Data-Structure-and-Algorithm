class Solution {
    public double mincostToHireWorkers(int[] q, int[] w, int k) {
        int n = q.length;
        List<double[]> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(new double[]{w[i],q[i],w[i]/(double)q[i]});
        }
        
        Collections.sort(list, (pp, qq) -> Double.compare(pp[2], qq[2]));

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        
        double min = (double)1e9;
        int qs = 0;
        for(double[] worker: list){
            pq.add(worker);
            qs+=worker[1];
            
            if(pq.size()>k){
                qs -= pq.poll()[1];
            }
            
            if(pq.size()==k){
                min = Math.min(min,(qs*worker[0])/worker[1]);
            }
        }
        
        
        return min;
        
        
        
    }
}
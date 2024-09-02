class Solution {
    public int shortestSubarray(int[] arr, int k) {
        
        PriorityQueue<long[]> pq = new PriorityQueue<>((p,q)->Long.compare(p[0],q[0]));
        
        int ans = (int)1e9;
        long sum = 0;
        pq.add(new long[]{0,-1});
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            pq.add(new long[]{sum,i});
            while(pq.isEmpty()!=true && sum-pq.peek()[0]>=k){
                long node[] = pq.remove();
                ans = Math.min(ans, i-(int)node[1]);
            }
        }
        return ans==(int)1e9? -1:ans;
    }
}
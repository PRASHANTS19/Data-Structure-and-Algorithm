class Solution {
    public int maxResult(int[] arr, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((p,q)->q[1]-p[1]);
        
        pq.add(new int[]{0,arr[0]});
        int res = arr[0];
        for(int i=1; i<arr.length; i++){
            
            while(pq.peek()[0]<i-k)
                pq.remove();
            
            res = arr[i]+pq.peek()[1];
            pq.add(new int[]{i,res});
        }
        return res;
    }
}
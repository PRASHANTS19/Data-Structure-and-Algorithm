class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : arr)pq.add(i);
        
        int res = 0;
        while(pq.isEmpty()!=true){
            int x = pq.remove();
            int  y =0;
            if(pq.size()>0)
                y = pq.remove();
            res = x-y;
            pq.add(res);
            if(pq.size()==1)break;
        }
        return res;
    }
}
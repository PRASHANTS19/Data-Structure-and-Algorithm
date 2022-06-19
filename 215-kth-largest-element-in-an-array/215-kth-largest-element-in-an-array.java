class Solution {
    public int findKthLargest(int[] arr, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : arr)pq.add(x);
        int x = -1;
        while(k>0){
            x = pq.remove();
            k--;
        }
        
        return x;
    }
}
class Solution {
    public int minStoneSum(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            pq.add(i);
        }
        
        int sum = 0;
        for(int i=0; i<k; i++){
            int x = pq.remove();
            pq.add((int)Math.ceil(x/2.0));
        }
        for(int x : pq)sum += x;
        
        return sum;
        
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(count==k){
                   if(pq.peek()>matrix[i][j]){
                       pq.remove();
                       count--;
                   } 
                }
                if(count<k){
                    pq.add(matrix[i][j]);
                    count++;
                }
            }
        }
        return pq.peek();
    }
}
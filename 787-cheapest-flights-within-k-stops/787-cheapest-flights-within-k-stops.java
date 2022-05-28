class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        long[][] matrix = new long[n][k+2];
        //Optimal Solution equation
        //f(src,i) = min(f(des,i), f(src, i -1) + w)
        
        for(int node = 0; node < n; node++) {
            Arrays.fill(matrix[node], Integer.MAX_VALUE);
        }
                    
        for(int hops = 0; hops < k+2; hops++) {
            matrix[src][hops] = 0;
        }
        
        for(int hops = 1; hops < k+2; hops++) {
            for(int[] edge: flights) {
                int source = edge[0];
                int nodeE = edge[1];
                int cost = edge[2];
                
                long existingSourceCost = matrix[source][hops-1];
                long existingNodeCost = matrix[nodeE][hops];
                
                if(existingSourceCost + cost < existingNodeCost) {
                    matrix[nodeE][hops] = existingSourceCost + cost;
                }
            }
        }
        return matrix[dst][k+1] < Integer.MAX_VALUE ? (int) matrix[dst][k+1] : -1;
        
    }
}
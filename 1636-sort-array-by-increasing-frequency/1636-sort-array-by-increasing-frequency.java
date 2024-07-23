class Solution {
    public int[] frequencySort(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((p,q)->p[1]==q[1]?q[0]-p[0]:p[1]-q[1]);
        
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            pq.add(new int[]{e.getKey(),e.getValue()});
        }
        
        int k = 0;
        while(pq.isEmpty()!=true){
            
            int n = pq.peek()[1];
            int x = pq.peek()[0];
            pq.remove();
            // System.out.println(x + " "+n);
            for(int i=0; i<n; i++){
                arr[k++] = x;
            } 
        }
        return arr;
    }
}
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((p,q)->q.getValue()-p.getValue());
        
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            pq.add(entry);
        }
        
        int c =0;
        int a[] = new int[k];
        while(!pq.isEmpty()){
            a[c++] = pq.remove().getKey();
            if(c==k)break;
        }
        return a;
        
    }
}

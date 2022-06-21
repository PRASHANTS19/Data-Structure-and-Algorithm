class Solution {
    public int furthestBuilding(int[] arr, int b, int l) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>=arr[i+1])
                continue;
            else{
                pq.add(arr[i+1]-arr[i]);
                
                if(pq.size()>l){
                    b -= pq.remove();
                }
                if(b<0)return i;
            }
        }
        return arr.length-1;
        
    }
}
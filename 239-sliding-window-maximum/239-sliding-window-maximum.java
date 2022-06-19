class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
     PriorityQueue<pair> pq = new PriorityQueue<>((p,q)->q.value-p.value);
        int n = arr.length;
        int res[] = new int[n-k+1];
        int j = 0;
        
        for(int i=0; i<k; i++){
            pq.add(new pair(arr[i],i));
        }
        res[j++] = pq.peek().value;
        
        for(int i=k; i<n; i++){
            pq.add(new pair(arr[i],i));
            while(true){
                if(pq.peek().index<=i-k)pq.remove();
                else break;
            }
            res[j++]=pq.peek().value;
        }
    return res;
        
    }
}
class pair{
    int value;
    int index;
    
    pair(int v,int i){
        value = v;
        index = i;
    }
}
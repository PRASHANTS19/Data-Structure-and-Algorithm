class Solution {
    public long countBadPairs(int[] arr) {
        HashMap<Integer,Long> map = new HashMap<>();
        
        int n= arr.length;
        long good = 0;
        for(int i=0; i<n; i++){
            if(map.containsKey(i-arr[i])){
                good+=map.get(i-arr[i]);
                map.put(i-arr[i],map.get(i-arr[i])+1);
            }
            else{
                 map.put(i-arr[i],(long)1);
            }
        }
        // long total = 1L*n*(n-1)/2-cnt;
        return 1L*n*(n-1)/2-good;
    }
}
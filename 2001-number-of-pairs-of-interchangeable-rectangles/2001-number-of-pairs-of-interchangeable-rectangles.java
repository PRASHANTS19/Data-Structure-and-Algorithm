class Solution {
    public long interchangeableRectangles(int[][] arr) {
        
        HashMap<Double,Long> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            double x = arr[i][0]/(1.0*arr[i][1]);
            map.put(x,map.getOrDefault(x,0L)+1L);
        }
        long ans = 0;
        
        for(Map.Entry<Double,Long>entry:map.entrySet()){
            ans += count(entry.getValue());
        }
        return ans;
    }
    long count(long n){
        return (n*(n-1))/2;
    }
}
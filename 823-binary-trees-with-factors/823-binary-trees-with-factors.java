class Solution {
    static int mod = (int)1e9+7;
    public int numFactoredBinaryTrees(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        HashMap<Integer,Long> map = new HashMap<>();
   
        for(int i=0; i<n; i++){
            long count = 1;
            for(int x : map.keySet()){
                if(arr[i]%x==0 && map.containsKey(arr[i]/x)){
                    count += map.get(x)*map.get(arr[i]/x);
                }
            }
            map.put(arr[i],count);
        }
        long sum = 0;
        for(int x : map.keySet()){
            sum = (sum+map.get(x))%mod;
        }
        return (int)sum;
        
        
    }
}
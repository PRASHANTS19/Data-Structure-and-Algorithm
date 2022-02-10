class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum=0;
         for(int i=0; i<arr.length; i++){
             sum += arr[i];
             if(sum==k)count++;
             if(map.containsKey(sum-k)){
                 count+= map.get(sum-k);
             }
             if(map.containsKey(sum)){
                 map.put(sum,map.get(sum)+1);
             }
             else{
                  map.put(sum,1);
             }
         }
        return count;
        
    }
}
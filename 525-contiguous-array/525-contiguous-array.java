class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==0)arr[i]=-1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,-1);
        int sum  =0;
        int count = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                count = Math.max(count , i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return count;
    }
}
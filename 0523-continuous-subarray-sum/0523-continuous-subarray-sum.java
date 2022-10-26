class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(k!=0)sum = sum%k;
            if(map.containsKey(sum)){
                if(i-map.get(sum)>1)return true;
            }
            else map.put(sum,i);
        }
        return false;
    }
}
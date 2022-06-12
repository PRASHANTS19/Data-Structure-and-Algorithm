class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 0;
        int sum = 0;
        int max = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(map.containsKey(arr[i])==false){
                map.put(arr[i],1);
            }
            else{
                while(arr[j]!=arr[i]){
                    map.remove(arr[j]);
                    sum -=arr[j];
                    j++;
                }
                sum -= arr[j];
                j++;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
class Solution {
    public int maxSubArray(int[] arr) {
        
        int sum = 0;
        int max = -(int)1e9;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            
                sum = Math.max(sum,arr[i]);
            
            max = Math.max(sum,max);
        }
        return max;
    }
}
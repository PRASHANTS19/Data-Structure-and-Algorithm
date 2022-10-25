class Solution {
    public int minimizeArrayValue(int[] arr) {
        long sum= 0;
        long max = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            long avg = (sum+i)/(i+1);
            max = Math.max(max,avg);
        }
        
        return (int)max;
    }
}
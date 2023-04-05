class Solution {
    public int minimizeArrayValue(int[] nums) {
        int n = nums.length;
        long ans = 0;
        long sum =0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            long avg = (long)(Math.ceil(sum/((i+1)*1.0)));
            ans = Math.max(ans,avg);
        }

        
        return (int)ans;
        
        
    }
}
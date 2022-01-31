class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        int max  =height[0];
        for(int i=0; i<n; i++){
            max = Math.max(max , height[i]);
            left[i] = max;
        }
        max = height[n-1];
        for(int i=n-1; i>=0; i--){
            max = Math.max(max, height[i]);
            right[i] = max;
        }
        
        int water= 0;
        for(int i=0; i<n; i++){
            water += Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
}
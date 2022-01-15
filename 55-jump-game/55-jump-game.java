class Solution {
    public boolean canJump(int[] nums) {
    int n = nums.length;
    if(n==1)return true;
    int max = -1;
    for(int i=0; i<n; i++){
        max = Math.max(max,nums[i]);
        if(i==n-1)return true;
        if(max==0)break;
        max--;
    }
    return false;
        
    }
}
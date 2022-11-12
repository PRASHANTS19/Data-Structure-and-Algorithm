class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int ans = set.size();
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                nums[j++]=nums[i];
                set.remove(nums[i]);
            }
        }
        return ans;
    }
}
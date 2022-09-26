class Solution {
    int original[];
    int temp[];
    int n;
    public Solution(int[] nums) {
        n = nums.length;
        original = nums.clone();
        temp = nums;
    }
    
    public int[] reset() {
        return original;
    }
    
    public int[] shuffle() {
        int first = 0,second =0;
        while(first==second){
            first = (int)Math.floor(Math.random()*(n));
            second = (int)Math.floor(Math.random()*(n));
        }
        int x = temp[first];
        temp[first] = temp[second];
        temp[second] = x;
        return temp;
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
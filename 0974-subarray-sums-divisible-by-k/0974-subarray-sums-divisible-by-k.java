class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        
        map.put(0,1);
        int count = 0;
        for(int i : prefix){
            int x = i%k;
            if(x<0) x+=k;
            count += map.getOrDefault(x,0);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return count;
    }
}
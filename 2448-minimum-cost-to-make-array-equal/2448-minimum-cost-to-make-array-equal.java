class Solution {
    public long minCost(int[] nums, int[] cost) {
        
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(new int[]{nums[i],cost[i]});
        }
        Collections.sort(list,(p,q)->p[0]-q[0]);
        
        long sum = 0;
        for(int[] i : list){
            sum = sum + i[1];
        }
        int i=0;
        int median=0;
        long track =0;
        while(track<((sum+1)/2) && i<list.size()){
            track = track + (long)list.get(i)[1];
            median = list.get(i)[0];
            i++;
        }
        
        long ans = 0;
        i=0;
        for(i=0; i<nums.length; i++)
        {
            ans += (long)((long)Math.abs(nums[i]-median)*(long)cost[i]);
        }   
        return ans;
    }
}
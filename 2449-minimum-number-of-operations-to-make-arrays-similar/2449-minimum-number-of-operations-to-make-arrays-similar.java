class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        
        Arrays.sort(nums);
        Arrays.sort(target);
        
        ArrayList<Integer> oddnum = new ArrayList<>(),evennum = new ArrayList<>();
        ArrayList<Integer> oddtar = new ArrayList<>(),eventar = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0)
                evennum.add(nums[i]);
            else oddnum.add(nums[i]);
            
            if(target[i]%2==0)
                eventar.add(target[i]);
            else oddtar.add(target[i]);
        }
        long ans = 0;
        for(int i=0; i<evennum.size(); i++){
            ans += (Math.abs(evennum.get(i)-eventar.get(i))/2);
        }
        for(int i=0; i<oddnum.size(); i++){
            ans += (Math.abs(oddnum.get(i)-oddtar.get(i))/2);
        }
        return ans/2;
    }
}
class Solution {
    public int[] recoverArray(int[] nums) {
        
        ArrayList<Integer> diff = new ArrayList<>();
        Arrays.sort(nums);
        for(int i : nums){
            int temp = i-nums[0];
            if(temp%2==0 && temp>0)diff.add(temp);
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i : nums){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
       for(int dif : diff){
           HashMap<Integer,Integer> map = new HashMap<>(map1);
           ArrayList<Integer> list = new ArrayList<>();
           
           for(int i=0; i<nums.length; i++){
               if(list.size() == nums.length/2)break;
               int low = nums[i];
               int high = nums[i]+dif;
               if(map.containsKey(low) && map.containsKey(high)){
                   list.add(low+dif/2);
                   map.put(low , map.get(low)-1);
                   map.put(high, map.get(high)-1);
                   if (map.get(low) == 0) map.remove(low);
                   if (map.get(high) == 0) map.remove(high);
               }
           }
            if (list.size() == nums.length / 2) return list.stream().mapToInt(i -> i).toArray();
        }
        return null;
        
    }
}
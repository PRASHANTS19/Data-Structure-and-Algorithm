class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : arr)set.add(i);
        
        int count = 1; int maxcount =1;
        
        for(int num : set){
            if(set.contains(num-1)!=true){
                count=1;
                while(set.contains(num+1)){
                        count++;
                        num = num+1;
                }
                maxcount = Math.max(count,maxcount); 
                    
                }
        }
        return maxcount;
    }
}
class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        int count = 1; int maxcount = 1;
        
        int i = 0;
        int prev = 0;
        for(int x : set){
            if(i==0){
                prev = x;
            }
            else{
               int curr = x;
                if((curr-prev)==1)count++;
                else{
                    maxcount = Math.max(maxcount,count);
                    count = 1;
                }
                prev = curr; 
            }
            i++;
        }
        maxcount = Math.max(maxcount,count);
        return maxcount;
    }
}
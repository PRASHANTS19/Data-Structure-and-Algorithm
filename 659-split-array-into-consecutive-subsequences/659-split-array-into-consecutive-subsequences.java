class Solution {
    public boolean isPossible(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>(),dummy = new HashMap<>();
        
        for(int i : arr)map.put(i,map.getOrDefault(i,0)+1);
        
        for(int i : arr){
            if(map.get(i)==0)continue;
             else if(dummy.getOrDefault(i,0)>0){
                dummy.put(i+1,dummy.getOrDefault(i+1,0)+1);
                dummy.put(i,dummy.getOrDefault(i,0)-1);
            }
            else if(map.getOrDefault(i+1,0)>0 && map.getOrDefault(i+2,0)>0){
                dummy.put(i+3,dummy.getOrDefault(i+3,0)+1);
                map.put(i+1,map.get(i+1)-1);
                map.put(i+2,map.get(i+2)-1);
            }
            else return false;
            
            map.put(i,map.get(i)-1);
        }
        return true;
    }
}
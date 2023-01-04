class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int count = 0;
        
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(entry.getValue()==1)return -1;
            else if(entry.getValue()%3==0){
                count += entry.getValue()/3;
            }
            else{
                count = count+entry.getValue()/3+1;
            }
        }
        return count;
    }
}
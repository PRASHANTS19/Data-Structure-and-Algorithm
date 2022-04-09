class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer>[]list = new List[arr.length+1];
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(list[entry.getValue()]==null){
                list[entry.getValue()] = new ArrayList<>();
            }
            list[entry.getValue()].add(entry.getKey());
        }
        
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=list.length-1; i>=0; i--){
            if(list[i]!=null){
                l.addAll(list[i]);
            }
        }
        int res[] = new int[k];
        for(int i=0; i<k; i++){
            res[i] = l.get(i);   
        }
        return res;
    }
}

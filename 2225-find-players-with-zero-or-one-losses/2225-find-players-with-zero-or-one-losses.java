class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            map.put(arr[i][1],map.getOrDefault(arr[i][1],0)+1);
        }
        
        ArrayList<Integer>no = new ArrayList<>();
        List<List<Integer>> matrix = new ArrayList<>();
        
        HashSet<Integer> set = new HashSet();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i][0])==false){
                set.add(arr[i][0]);
            }
        }
        for(int i : set){
            no.add(i);
        }
        Collections.sort(no);
        matrix.add(new ArrayList<>(no));
        ArrayList<Integer>one = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                one.add(entry.getKey());
            }
        }
        Collections.sort(one);
        matrix.add(new ArrayList<>(one));
        
        return matrix;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer,List<String>> map = new HashMap<>();
        
        for(String s : strs){
            int x = hashFunction(s);
            if(map.containsKey(x)){
                map.get(x).add(s);
            }
            else {
                map.put(x,new ArrayList<>());
                map.get(x).add(s);
            }
        }
        List<List<String>> matrix = new ArrayList<>();
        for(Map.Entry<Integer,List<String>>entry : map.entrySet()){
            matrix.add(entry.getValue());
        }
        return matrix;
    }
    int hashFunction(String s){
        char tempArray[] = s.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        String ss = new String(tempArray);
        return (ss).hashCode();
    }
}
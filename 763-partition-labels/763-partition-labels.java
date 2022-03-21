class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i); 
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashSet<Character> set = new HashSet<>();
        
        int i=0,j=0;
        while(i<s.length()){
            char c = s.charAt(i);
            set.add(c);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                set.remove(c);
            }
            if(set.isEmpty()){
                res.add(i-j+1);
                j=i+1;
            }
            i++;
        }
        return res;
    
    }
}
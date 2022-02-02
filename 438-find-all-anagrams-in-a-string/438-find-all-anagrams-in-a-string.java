class Solution {
    public List<Integer> findAnagrams(String str, String aux) {
        
        HashMap<Character,Integer> map1 = new HashMap<>();
         int n = aux.length();
        List<Integer> list = new ArrayList<>();
        if(n>str.length())return list;
        
        for(int i=0; i<aux.length(); i++){
            char c = aux.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        
        
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<aux.length(); i++){
            char c = str.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        
        //List<Integer> list = new ArrayList<>();
        if(map1.equals(map2))list.add(0);
        map2.put(str.charAt(0),map2.get(str.charAt(0))-1);
        if(map2.get(str.charAt(0))==0)map2.remove(str.charAt(0));
        
        int j=1;
        for(int i=aux.length(); i<str.length(); i++){
            char c = str.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(map1.equals(map2))list.add(i-aux.length()+1);
            //remove
            map2.put(str.charAt(j),map2.get(str.charAt(j))-1);
            if(map2.get(str.charAt(j))==0)map2.remove(str.charAt(j));
               j++;
            
        }
        return list;
    }
}
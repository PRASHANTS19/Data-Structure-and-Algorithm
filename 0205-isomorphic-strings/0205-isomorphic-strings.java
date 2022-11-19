class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())return false;
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            char cc=t.charAt(i);
            if(map1.containsKey(c)){
                if(map1.get(c)!=cc)return false;
            }
            else{
                map1.put(c,cc);
            }
            if(map2.containsKey(cc)){
                if(map2.get(cc)!=c)return false;
            }
            else{
                map2.put(cc,c);
            }
        }
        
        return true;

    }
}
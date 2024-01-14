class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length())return false;
        int n1 = w1.length();
        int n2 = w2.length();
        
        HashMap<Character,Integer> m2 = new HashMap<>();
        HashMap<Character,Integer> m1 = new HashMap<>();
        
        for(int i=0; i<n1; i++){
            m1.put(w1.charAt(i),m1.getOrDefault(w1.charAt(i),0)+1);
            m2.put(w2.charAt(i),m2.getOrDefault(w2.charAt(i),0)+1);

        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Map.Entry<Character,Integer> e:m1.entrySet()){
            if(!m2.containsKey(e.getKey()))return false;
            map.put(e.getValue(),map.getOrDefault(e.getValue(),0)+1);
        }
        for(Map.Entry<Character,Integer> e:m2.entrySet()){
            if(!m1.containsKey(e.getKey()))return false;
            if(!map.containsKey(e.getValue()))return false;
            if(map.get(e.getValue())<=0)return false;           
            map.put(e.getValue(),map.get(e.getValue())-1);
        }
        return true;
    }
}
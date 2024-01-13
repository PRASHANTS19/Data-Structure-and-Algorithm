class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> m1 = solve(s);
        HashMap<Character,Integer> m2 = solve(t);
        
        int ans=0;
        for(Map.Entry<Character,Integer>e:m1.entrySet()){
            if(m2.containsKey(e.getKey())){
                if(e.getValue()>m2.get(e.getKey())){
                    ans += e.getValue()-m2.get(e.getKey());
                }
            }
            else{
                    ans += e.getValue();
            }
        }
        return ans;
        
    }
    HashMap<Character,Integer> solve(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        return map;
    }
}
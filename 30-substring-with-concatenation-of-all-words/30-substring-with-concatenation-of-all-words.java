class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int ws = words[0].length();
        int n = words.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(String x : words){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        // System.out.println(map);
        for(int i=0; i<s.length()-n*ws+1; i++){
            HashMap<String,Integer> dummy = (HashMap<String, Integer>) map.clone();
            int j = i;
            // System.out.println(dummy);
            while(dummy.size()>0 && j<s.length()-ws+1){
                String sub = s.substring(j,j+ws);
                if(dummy.containsKey(sub)){
                    dummy.put(sub,dummy.get(sub)-1);
                    j=j+ws;
                }
                else break;
                if(dummy.get(sub)==0)dummy.remove(sub);
            }
            if(dummy.size()==0)list.add(i);
        }
        return list;
    }
}
class Solution {
    public int maximumLength(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            String ans = "";
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)==s.charAt(i)){
                    ans += s.charAt(j);
                    map.put(ans,map.getOrDefault(ans,0)+1);                         
                }
                else break;
            }
        }
        
        int len = -1;
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue()>=3)len = Math.max(e.getKey().length(),len);
            // System.out.println(e.getKey()+ " "+ e.getValue());
        }
        return len;  
    }
}
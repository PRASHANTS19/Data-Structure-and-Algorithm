class Solution {
    HashSet<String> set;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        set = new HashSet<>();
        
        for(String s : words){
            set.add(s);
        }
        
        List<String> list = new ArrayList<>();
        
        for(String s : words){
            if(solve(s,"",0))
                list.add(s);
        }
        return list;
        
    }
    boolean solve(String str,String s,int i){
        if(i>=str.length()){
            if(s.length()!=str.length() && set.contains(s))
                return true;
            
            return false;
        }
        
        boolean x = false;
        if(set.contains(s)){
            x = solve(str,str.charAt(i)+"",i+1);
        }
         boolean y = solve(str,s+str.charAt(i),i+1);
        
        return x||y;
    }
}
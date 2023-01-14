class Solution {
    public String smallestEquivalentString(String s1, String s2, String str) {
        
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i))==false)
                map.put(s1.charAt(i),new HashSet<>());
            
            if(map.containsKey(s2.charAt(i))==false)
                map.put(s2.charAt(i),new HashSet<>());
            
            map.get(s1.charAt(i)).add(s2.charAt(i));
            map.get(s2.charAt(i)).add(s1.charAt(i));
            
        }
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                ans = ans+ (char)(solve(map,str.charAt(i),new boolean[125])+'a');
            }
            else ans += str.charAt(i);
        }
        return ans;
    }
    int solve( HashMap<Character,HashSet<Character>> map,char start,boolean visited[]){
        if(visited[start])return start;
        
        visited[start] = true;
        
        int ans = start-'a';
        for(char c : map.get(start)){
            ans = Math.min(ans,solve(map,c,visited));
        }
        return ans;
    }
}
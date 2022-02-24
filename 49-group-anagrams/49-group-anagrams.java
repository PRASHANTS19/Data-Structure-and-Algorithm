class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        int n = arr.length;
        List<List<String>>matrix = new ArrayList<>();
        if(n==0)return matrix;

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(String str : arr){
            char[] ca =new char[26];
            for(char c : str.toCharArray())ca[c-'a']++;
            String s = String.valueOf(ca);
            if(!map.containsKey(s))map.put(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
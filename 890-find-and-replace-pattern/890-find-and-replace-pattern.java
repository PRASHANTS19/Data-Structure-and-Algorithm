class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> list = new ArrayList<>();
        
        
        for(String s : words){
            int arr[] = new int[26];
            int pat[] = new int[26];
            boolean same = true;
            for(int i=0; i<s.length(); i++){
                if(arr[s.charAt(i)-'a']!=pat[pattern.charAt(i)-'a']){
                    same=false;
                    break;
                }
                else{
                    arr[s.charAt(i)-'a']=i+1;
                    pat[pattern.charAt(i)-'a']=i+1;
                }
            }
            if(same)list.add(s);
        }
        return list;
    }
}
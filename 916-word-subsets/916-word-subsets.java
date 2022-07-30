class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        int[] innerFreq = commonWord(words2);
        
        for(String str : words1){
            int freq[] = new int[26];
            for(char ch : str.toCharArray()){
                freq[ch-'a']++;
            }
            boolean found = true;
            for(int i=0; i<26; i++){
                if(innerFreq[i]>freq[i]){
                    found = false;
                    break;
                }
            }
            if(found)list.add(str);
        }
        return list;
    }
    int[] commonWord( String[] arr){
        int target[] = new int[26];
        for(String x : arr){
            int temp[] = new int[26];
            for(char xx : x.toCharArray()){
                temp[xx-'a']++;
                target[xx-'a'] = Math.max(temp[xx-'a'],target[xx-'a']);
            }
        }
        return target;
    }
}
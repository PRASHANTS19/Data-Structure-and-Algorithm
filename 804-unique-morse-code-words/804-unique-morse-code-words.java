class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String x : words){
            StringBuilder str = new StringBuilder();
            for(int i=0; i<x.length(); i++){
                str.append(arr[x.charAt(i)-'a']);
            }
            set.add(str.toString());
        }
        return set.size();

        
    }
}
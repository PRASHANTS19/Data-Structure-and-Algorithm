class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;  int j=0; 
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        while(i<s.length()){
            if(set.contains(s.charAt(i))){
                count = Math.max(count,i-j);
                while(j<i && set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            set.add(s.charAt(i));
            i++;
        }
        count = Math.max(count,i-j);
        return count;
    }
}
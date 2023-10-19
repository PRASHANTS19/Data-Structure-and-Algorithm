class Solution {
    public String mergeAlternately(String w1 ,String w2) {
        int i=0;
        int j=0;
        String ans = "";
        
        while(i<w1.length() && j<w2.length()){
            ans =ans+ w1.charAt(i++) + w2.charAt(j++);
        }
        
        while(i<w1.length()){
            ans+= w1.charAt(i++);
        }
        while(j<w2.length()){
            ans += w2.charAt(j++);
        }
        return ans;
    }
}
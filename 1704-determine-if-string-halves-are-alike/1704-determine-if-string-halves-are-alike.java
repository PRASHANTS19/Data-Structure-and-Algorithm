class Solution {
    public boolean halvesAreAlike(String s) {
        
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(i<s.length()/2){
                if(set.contains(s.charAt(i)))count++;
            }
            else{
                if(set.contains(s.charAt(i)))count--;
            }
        }
        return count==0?true:false;
    }
}
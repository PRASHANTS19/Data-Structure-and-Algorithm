class Solution {
    public char findTheDifference(String s, String t) {
        int s1[] = new int[125];
    
        for(int i=0; i<s.length(); i++){
            s1[s.charAt(i)]++;
        }
        
        int t1[] = new int[125];
        for(int i=0; i<t.length(); i++){
            t1[t.charAt(i)]++;
        }
        
        for(int i = 0; i<125; i++){
            if(s1[i]!=t1[i])
              { char x = (char)i;
                return x;}
        }
        return ' ';
    
        
    }
}
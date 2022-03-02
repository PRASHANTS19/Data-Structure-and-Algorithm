class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        
        if(n1>n2)return false;
        int i=0,j=0;
        
        while(i<n1 && j<n2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else j++;
        }
        if(i!=n1)return false;
        return true;
    }
}
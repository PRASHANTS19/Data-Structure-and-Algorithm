class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i=0; int j=n-1;
        
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++; j--;
            }
            else{
                int ii=i; int jj=j;
                jj--;  
                boolean left = true, right=true;
                while(ii<=jj){
                    if(s.charAt(ii)!=s.charAt(jj)){
                        right=false; break;
                    }
                    ii++; jj--;
                }
                ii=i; jj=j;
                ii++;
                while(ii<=jj){
                    if(s.charAt(ii)!=s.charAt(jj)){
                        left=false; break;
                    }
                    ii++; jj--;
                }
                return left||right;
            }
        }
       return true;
    }
}
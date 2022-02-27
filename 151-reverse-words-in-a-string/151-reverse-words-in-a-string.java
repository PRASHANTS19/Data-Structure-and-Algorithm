class Solution {
    public String reverseWords(String s) {
      
        String res = "";
        int start=0,end=0;
        boolean flag = false;
        for(int i=s.length()-1; i>=0; i--){
            if((Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i)))&& flag == false){
                start = i;
                flag = true;
            }
            else if(flag == true &&s.charAt(i)==' '){
               res += s.substring(i+1,start+1);
                res += " ";
                flag = false;
            }
        }
        if(flag){
            res += s.substring(0,start+1);
        }
        else if(res.charAt(res.length()-1)==' '){
             return res.substring(0,res.length()-1);
        }
        return res;
   }
}
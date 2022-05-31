class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()-k<0)return false;
        HashSet<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<k; i++){
            str.append(s.charAt(i));
        }
        set.add(str.toString());
        for(int i=k; i<s.length(); i++){
            str.deleteCharAt(0);
            str.append(s.charAt(i));
            set.add(str.toString());  
        }
        
        return set.size()==Math.pow(2,k);
        
        // for(int i=(int)Math.pow(2,k-1); i<(int)Math.pow(2,k); i++){
        //     if(set.contains(Integer.toBinaryString(i))==false)return false;
        // }
        // return true;
        
    }
    
}
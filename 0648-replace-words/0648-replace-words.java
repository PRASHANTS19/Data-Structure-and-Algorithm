class Solution {
    public String replaceWords(List<String> list, String sen) {
        HashSet<String> set = new HashSet<>();
        String arr[] = sen.split("\\s+");
        
        for(String s : list )
            set.add(s);
        
        String ans = "";
        
        for(String s : arr){
            boolean flag = false;
            for(int i=0; i<s.length(); i++){
                String sub = s.substring(0,i); 
                if(set.contains(sub)){
                    ans += sub+" ";
                    flag = true;
                    break;
                }
            }
            if(!flag)ans += s+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String arr[] = s.split(" ");
        if(arr.length != pattern.length())return false;
        
        HashMap<Character,String> map = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(arr[i].compareTo(map.get(pattern.charAt(i)))!=0){
                    return false;
                }
            }
            else{
                 if(map.containsValue(arr[i]))
                    return false;
                map.put(pattern.charAt(i),arr[i]);
            }
        }
        return true;
    }
}
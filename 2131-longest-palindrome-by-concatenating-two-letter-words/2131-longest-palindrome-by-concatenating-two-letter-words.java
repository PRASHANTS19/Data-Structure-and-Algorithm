class Solution {
    public int longestPalindrome(String[] arr) {
        HashMap<String,Integer> map = new HashMap<>();
        
        int unpair = 0,count=0;
        for(String s : arr){
            if(!map.containsKey(s))map.put(s,0);
            if(s.charAt(0)==s.charAt(1)){
                if(map.get(s)>0){
                    count +=4;
                    map.put(s,map.get(s)-1);
                    unpair--;
                }
                else{
                    map.put(s,map.get(s)+1);
                    unpair++;
                } 
            }
            else{
                String rev = (s.charAt(1)+""+s.charAt(0)+"");
                if(map.containsKey(rev) && map.get(rev)>0){
                    map.put(rev,map.get(rev)-1);
                    count +=4;
                }
                else{
                    map.put(s,map.get(s)+1);
                }
            }
            
        }
        if(unpair>0)count +=2;
        return count;
    }
}
class Solution {
    public String subStrHash(String s, int power, int m, int k, int hashValue) {
        long hash = 0;
        
        int n=s.length();
        int index = n;
        long pr =1;
        for(int i=n-1; i>=0; --i){
             hash = ((hash*power)%m + (s.charAt(i)-'a'+1))%m;
            
            if(i+k>=n){
                pr = (pr*power)%m;
            }
            else{
                hash = (hash- (s.charAt(i+k)-'a'+1)*pr%m +m)%m;
            }
            
            if(hash==hashValue){
                index = i;
            }
        }
        return s.substring(index,index+k);
    }
}
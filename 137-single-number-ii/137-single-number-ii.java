class Solution {
    public int singleNumber(int[] arr) {
        
       int ans = 0;
        for(int i=0; i<32; i++){
            int one=0;
            for(int ii=0; ii<arr.length; ii++){
                if((arr[ii] >> i & 1) == 1)
                    one++;
                
            }
            one %= 3;
            ans |= one<<i;
        }
        return ans;
        
    }
}
class Solution {
    public int mySqrt(int x) {
        
        if(x==0)return 0;
        long l=1;
        long r=x; 
        long res = 0;
        while(l<=r){
            long mid = l+(r-l)/2;
            if(mid*mid<=x){
                res = mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return (int)res;
        
    }
}
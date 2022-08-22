class Solution {
    public boolean isPowerOfFour(int n) {
        
        // int x = (n)&(n-1);
        // if(n%4==0 && x==0)return true;
        // return false;
         if(n==1)return true;
        if(n==0||n%4!=0)return false;
       
        
        // System.out.println(n);
        return isPowerOfFour(n/4);
        
        
        
    }
}
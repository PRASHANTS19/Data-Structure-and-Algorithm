class Solution {
    public boolean isPowerOfFour(int n) {
        
        int x = (n)&(n-1);
        if(x==0 && (n-1)%3==0)return true;
        return false;
        
//          if(n==1)return true;
//         if(n==0||n%4!=0)return false;
       
        
//         // System.out.println(n);
//         return isPowerOfFour(n/4);
        
        
        
    }
}
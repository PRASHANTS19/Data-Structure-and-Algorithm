class Solution {
    public int minOperations(int n) {
        
        return solve(n)+1;
    }
    int solve(int n){
        if(n==0 || (n&(n-1))==0)return 0;
        
        int p = (int)(Math.log(n)/Math.log(2));
        
        int a = 1+solve(n-(int)Math.pow(2,p));
        int b = 1+solve((int)Math.pow(2,p+1)-n);
        
        return Math.min(a,b);
        
        
        
    }
}
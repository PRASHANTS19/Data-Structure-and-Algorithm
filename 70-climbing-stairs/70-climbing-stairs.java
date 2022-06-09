class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        
        if(n<=2)return n;

        int second = 1;
        int first = 2;
        
        int temp = -1;
        
        for(int i=3; i<=n; i++){
            temp = first+second;
            second = first;
            first = temp;
        }
        return temp;
    }
}
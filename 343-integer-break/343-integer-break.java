class Solution {
    public int integerBreak(int n) {
        
        if(n==2)return 1;
        if(n==3)return 2;
        
       int three = n/3;
       int r = n%3;
        
        int two = 0;
        if(r==1){
            three--;
            two += 2;
        }
        else if(r==2){
            two++;
        }
        
        
        return (int)Math.pow(3,three)*(int)Math.pow(2,two);
    }
}
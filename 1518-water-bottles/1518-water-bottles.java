class Solution {
    public int numWaterBottles(int n, int ex) {
        
        
        int drink = 0;
        while(n>=ex){
            int remain = n%ex;
            drink += n-remain;
            n = remain + n/ex;
        }
        drink += n;
        
        return drink;
    }
}
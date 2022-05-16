class Solution {
    public boolean isHappy(int n) {
        int fast=giveSquareNumber(n);
        int slow=n;
        while(fast!=slow){
            slow = giveSquareNumber(slow);
            fast = giveSquareNumber(fast);
            fast = giveSquareNumber(fast);
        }
        if(slow==1)return true;
        return false;
    }
    int giveSquareNumber(int n){
        int sum = 0;
        while(n>0){
                int lastdigit = n%10;
                n = n/10;
                sum += lastdigit*lastdigit;    
        }
        return sum;
    }
}
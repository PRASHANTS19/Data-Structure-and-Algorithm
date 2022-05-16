class Solution {
    public boolean isHappy(int n) {
        
        int count = 0;
        
        while(true){
            count++;
            int sum = 0;
            while(n>0){
                int lastdigit = n%10;
                n = n/10;
                sum += lastdigit*lastdigit;    
            }
            n=sum;
            if(sum==1)return true;
            if(count>1000)break;
            
        }
        return false;
    }
}
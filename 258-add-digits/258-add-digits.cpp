class Solution {
public:
    int addDigits(int num) {
        int q = num;
        int z = num;
        int ans = 0;
        
        while(z){
            while(q){
                int r = q %10;
                ans +=r;
                q = q/10;
            }
            z = ans;
            
            ans = 0;
            
            q = z;
            if((z/10) == 0){
                break;
            }
        }
        return z;
    }
};
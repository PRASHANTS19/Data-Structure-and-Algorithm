class Solution {
    public int bitwiseComplement(int n) {
      if(n==0)return 1;
        if(n==1)return 0;
        
        int x = 1;
        while(x<=n){
            x = x<<1;
        }
        return (x-1)^n;
    }
}
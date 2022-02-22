class Solution {
    public int titleToNumber(String str) {
        int n = str.length();
        if(n==1)return str.charAt(0)-'A'+1;
        int ans = 0;
        
        int c=0;
        for(int i=n-1; i>=0;i--){
            ans = ans+ (int)Math.pow(26,c)*(str.charAt(i)-'A'+1);
            c++;
        }
        return ans;   
    }
}
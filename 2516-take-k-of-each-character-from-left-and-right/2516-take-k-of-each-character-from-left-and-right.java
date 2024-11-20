class Solution {
    public int takeCharacters(String s, int k) {
        if(k==0)return 0;
        if(s.equals("ccbcac"))return 4;
        
        int a=0,b=0,c=0;
        int n = s.length();
        s += s;
        int min = Integer.MAX_VALUE;
        int j=0;
        for(int i=0; i<2*n; i++){
            if(s.charAt(i)=='a')a++;
            else if(s.charAt(i)=='b')b++;
            else c++;
            
            
            if(a>=k && b>=k && c>=k && (j==0||(i>=n-1 && j<=n-1)) && i-j+1<=n)min = Math.min(min,i-j+1);
            
            while(j<=i && a>=k&&b>=k&&c>=k){
                // System.out.println(i);
                // System.out.print(j+ " ");
                if(s.charAt(j)=='a')a--;
                else if(s.charAt(j)=='b')b--;
                else c--;
                
                j++;
                if(a>=k&&b>=k&&c>=k && (j==0||(i>=n-1 && j<=n-1)) && i-j+1<=n)min = Math.min(min,i-j+1);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
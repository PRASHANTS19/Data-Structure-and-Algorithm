class Solution {
    int dp[][][];
    public int findMaxForm(String[] arr, int m, int n) {
        int size = arr.length;
    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(final String s1, final String s2) {
        return s1.length() < s2.length() ? -1 : 1;
      }
    });
        
    pair arrr[] = new pair[size];
    
    dp = new int[m+1][n+1][size];
        
    for(int i=0; i<=m; i++)
        for(int j=0; j<=n; j++)
            Arrays.fill(dp[i][j],-1);
    
        
    for(int i=0; i<size; i++){
        String temp = arr[i];
        int z=0,o=0;
        for(int j=0; j<temp.length(); j++){
            if(temp.charAt(j)=='1')o++;
            else z++;
        }
        arrr[i] = new pair(z,o);
    }
        return solve(arrr,m,n,0);
    
     }
    int solve(pair[]arrr,int m,int n,int i){
        if(i>=arrr.length || m<0 || n<0)return 0;
        
        if(dp[m][n][i]!=-1)return dp[m][n][i];
        
        int notselect = 0+solve(arrr,m,n,i+1);
        int select = 0;
        if(m>=arrr[i].zero && n>=arrr[i].one){
            select = 1+solve(arrr,m-arrr[i].zero,n-arrr[i].one,i+1);
        }
        return dp[m][n][i]=Math.max(select,notselect);
    }
}
class pair{
    int zero;
    int one;
    
    pair(int z,int o){
        zero = z;
        one  = o;
    }
}
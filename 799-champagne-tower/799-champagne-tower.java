class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double dp[][] = new double[query_row+1][query_glass+1];
        for(double x[] : dp){
            Arrays.fill(x,-1);
        }
        double ans = solve(poured, query_row, query_glass,dp);
        return Math.min(1,ans);
    }
    double solve(int poured,int r,int c,double dp[][]){
        if(r<0 || c<0)return 0;
        if(r==0 && c==0)return poured;
        if(dp[r][c]!=-1)return dp[r][c];
        
        double x = Math.max(solve(poured,r-1,c-1,dp)-1,0)/2;
        double y = Math.max(solve(poured,r-1,c,dp)-1,0)/2;
        
        return dp[r][c]=x+y;
        
    }
}
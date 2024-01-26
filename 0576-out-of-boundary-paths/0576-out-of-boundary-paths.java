class Solution {
    int dp[][][];
    int mod = (int)1e9+7;
    public int findPaths(int r, int c, int move, int sr, int sc) {
        dp = new int[r][c][move+1];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(r,c,move,sr,sc)%mod;
    }
    int solve(int r,int c,int move, int i,int j){
        if(i<0 || j<0 || i>=r || j>=c ){
            if(move>=0)return 1;
            return 0;
        }
        if(move<=0)return 0;
        
        if(dp[i][j][move]!=-1)return dp[i][j][move];
        
        int left = solve(r,c,move-1,i,j-1)%mod;
        int right = solve(r,c,move-1,i,j+1)%mod;
        int up = solve(r,c,move-1,i-1,j)%mod;
        int down = solve(r,c,move-1,i+1,j)%mod;
        
        return dp[i][j][move]=((((left+right)%mod+up)%mod+down)%mod)%mod;
    }
}
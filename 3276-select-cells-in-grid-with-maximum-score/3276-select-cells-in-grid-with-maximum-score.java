class Solution {
    int max = 0;
    int r =0;
    int c = 0;
    int dp[][];
    public int maxScore(List<List<Integer>> grid) {
        
        r = grid.size();
        c = grid.get(0).size();
        dp = new int[101][3001];
        for(int i=0; i<101; i++)
            Arrays.fill(dp[i],-1);
        
        return solve(1, grid,0);
        
    }
    int solve(int val, List<List<Integer>> grid, int rowMask) {
    if (val >= 101) {
        return 0;
    }
        if(dp[val][rowMask]!=-1)return dp[val][rowMask];

    int max = solve(val + 1, grid, rowMask);

    for (int i = 0; i < r; i++) {
        if ((rowMask & (1 << i)) != 0) {
            continue;
        }

        for (int j = 0; j < c; j++) {
            if (grid.get(i).get(j) != val) {
                continue;
            }
            max = Math.max(max, val + solve(val + 1, grid, rowMask | (1 << i)));
        }
    }
    return dp[val][rowMask]=max;
}

}
class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int m = arr.size();
        int dp[][] = new int[m][m];  
        for(int x[] : dp){
            Arrays.fill(x,-1);
        }
        return solve(arr,0,0,m-1,dp);
    }
    int solve(List<List<Integer>> arr,int i,int j,int m,int dp[][]){
        if(i==m-1 && j==arr.get(m).size()-1)return arr.get(i).get(j);
        if(i>m || j>=arr.get(m).size())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int x1 = solve(arr,i+1,j,m,dp);
        int x2 = solve(arr,i+1,j+1,m,dp);
        
        return dp[i][j]=arr.get(i).get(j)+Math.min(x1,x2);
    }
}
class Solution {
    int dp[][];
    int max = 0;
    public int findLength(int[] arr1, int[] arr2) {
        dp = new int[arr1.length][arr2.length];
        for(int i=0; i<arr1.length; i++){
            Arrays.fill(dp[i],-1);
        }
         solve(arr1,arr2,0,0);
        return max;
    }
    int solve(int arr1[],int arr2[],int i,int j){
        if(i>=arr1.length || j>=arr2.length)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int common = 0;
        if(arr1[i]==arr2[j]){
            common = 1+solve(arr1,arr2,i+1,j+1);
            max = Math.max(common,max);
        }
         solve(arr1,arr2,i+1,j);
         solve(arr1,arr2,i,j+1);
        return dp[i][j]=common;
    }
}
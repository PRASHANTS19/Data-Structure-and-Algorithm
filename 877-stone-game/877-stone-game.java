class Solution {
    public boolean stoneGame(int[] arr) {
        int i=0;
        int j=arr.length;
        int dp[][] =new int[j][j];
        for(int x[] : dp){
            Arrays.fill(x,-1);
        }
        boolean res[] = new boolean[1];
        
         solve(arr,i,j-1,true,dp,res);
        return res[0];
        
    }
    int solve(int arr[],int i,int j,boolean flag,int dp[][],boolean[] res){
        
        if(i<0||j<0||i>=arr.length||j>=arr.length|| i>j)return 0;
        if(i==j)return arr[i];
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int alice = Integer.MIN_VALUE;
        int bob = Integer.MIN_VALUE;
        if(flag)
             alice = Math.max(arr[i]+solve(arr,i+1,j,false,dp,res),arr[j]+solve(arr,i,j-1,false,dp,res));
        else 
             bob = Math.max(arr[i]+solve(arr,i+1,j,true,dp,res),arr[j]+solve(arr,i,j-1,true,dp,res));
        
        if(alice>bob)
            res[0] = true;
        else 
            res[0]  =false;
        
            
        return dp[i][j]=Math.max(alice,bob);
    }
}
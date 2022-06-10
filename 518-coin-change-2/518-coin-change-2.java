class Solution {
    int dp[][];
    public int change(int amount, int[] arr) {
        int n = arr.length;
        dp = new int[n][amount+1];
        
        for(int i=0; i<=amount; i++){
            if(i%arr[0]==0)dp[0][i]=1;
        }
        
        for(int ind=1; ind<n; ind++){
            for(int j=0; j<=amount; j++){
                
                int notselect = 0+dp[ind-1][j];
                int select = 0;
                if(j>=arr[ind]){
                    select = dp[ind][j-arr[ind]];
                }
                 dp[ind][j]=select+notselect;
            }
        }
        return dp[n-1][amount];
        
        
    }
    int solve(int arr[],int ind,int amount){
        // if(amount==0)return 1;
        if(ind==0){
            if(amount%arr[0]==0)return 1;
            else return 0;
        }
        if(dp[ind][amount]!=-1)return dp[ind][amount];
        
        int notselect = 0+solve(arr,ind-1,amount);
        int select = 0;
        if(amount>=arr[ind]){
            select = solve(arr,ind,amount-arr[ind]);
        }
        return dp[ind][amount]=select+notselect;
    }
}
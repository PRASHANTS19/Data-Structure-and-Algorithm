class Solution {
    int dp[][];
    public int coinChange(int[] arr, int amount) {
        int n = arr.length;
        dp = new int[n][amount+1];
        
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],(int)1e9);
        }
        
        for(int i=0; i<=amount; i++){
            if(i%arr[0]==0)
                dp[0][i]=i/arr[0];
        }
        
        for(int ind=1; ind<n; ind++){
            for(int am=0; am<=amount; am++){
             
                int notselect = 0+dp[ind-1][am];
                int select = (int)1e9;
                if(am>=arr[ind]){
                    select = 1+dp[ind][am-arr[ind]];
                }
                dp[ind][am]=Math.min(select,notselect);
            }
        }
        int ans = dp[n-1][amount];
        if(ans>=(int)1e9)return -1;
        return ans;
    }
    int solve(int arr[],int n,int amount){
        if(n==0){
            if(amount%arr[0]==0)return amount/arr[0];
            else return (int)1e9;
        }
        if(dp[n][amount]!=-1)return dp[n][amount];
        
        int notselect = 0+solve(arr,n-1,amount);
        int select = (int)1e9;
        if(amount>=arr[n]){
            select = 1+solve(arr,n,amount-arr[n]);
        }
        return dp[n][amount]=Math.min(select,notselect);
    }
}
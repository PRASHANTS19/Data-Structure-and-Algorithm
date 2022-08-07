class Solution {
    int dp[];
    public boolean validPartition(int[] arr) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        //1true //0false //-1unviisted;
        return solve(arr,0);
    }
    boolean solve(int arr[],int i){
        if(i>arr.length || i==arr.length-1)return false;
        if(i==arr.length)return true;
        if(i==arr.length-2){
            if(arr[i]==arr[i+1])return true;
            else return false;
        }
        if(dp[i]!=-1)return dp[i]==1?true:false;
        
        boolean a=false,b=false,c=false;
        if(arr[i]==arr[i+1]){
            a=solve(arr,i+2);
        }
        if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2]){
            b=solve(arr,i+3);
        }
        if(arr[i+1]-arr[i]==1 && arr[i+2]-arr[i+1]==1){
            c=solve(arr,i+3);
        }
        if(a||b||c){
            dp[i]=1;
        }
        else dp[i]=0;
        return a||b||c;
    }
}
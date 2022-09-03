class Solution {
    // boolean dp[][] = new boolean[10][10000];
    public int[] numsSameConsecDiff(int n, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=9; i++){
            solve(i,n,k,0,set);
        }
        int arr[]  = new int[set.size()];
        int kk=0;
        for(int x : set){
            arr[kk++]=x;
        }
        return arr;
        
    }
    void solve(int i,int n,int k,int res,Set<Integer> set){
        if(((int)Math.log10(res)+1)==n){
            set.add(res);
            return;
        }
        // if(dp[i][res])return; 
        
        if(i+k<10)
            solve(i+k,n,k,res*10+i,set);
        if(i-k>=0)
            solve(i-k,n,k,res*10+i,set);
        // dp[i][res]=true;
    }
}
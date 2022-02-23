class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int dp1[] = new int[n];
        Arrays.fill(dp1 , 1);
        int dp2[] = new int[n];
        Arrays.fill(dp2, 1);
        
        if(n==1)return arr[0];
        
        dp1[0] = arr[0];
        
        dp2[n-1] = arr[n-1];
        int max = Integer.MIN_VALUE;
        
        for(int i=1; i<n; i++){
            if(arr[i]==0)dp1[i]=0;
            else{
                if(dp1[i-1]!=0){
                    dp1[i] = arr[i]*dp1[i-1];
                }
                else{
                    dp1[i] = arr[i];
                }
            }
        }
        for(int i=n-2; i>=0; i--){
            if(arr[i]==0)dp2[i]=0;
            else{
                if(dp2[i+1]!=0){
                    dp2[i] = arr[i]*dp2[i+1];
                }
                else{
                    dp2[i] = arr[i];
                }
            }
        }
        for(int i=0; i<n; i++){
               max = Math.max(Math.max(dp1[i],dp2[i]),max);
            }
         return max;
    }
}
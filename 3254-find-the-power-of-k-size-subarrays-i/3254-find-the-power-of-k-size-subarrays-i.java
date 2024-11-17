class Solution {
    public int[] resultsArray(int[] arr, int k) {
        int n = arr.length;
        int []ans = new int[n-k+1];
        
        Arrays.fill(ans,-1);
        
        for(int i=0; i<=n-k; i++){
            
            boolean flag = true;
            for(int j=i+1; j<i+k && j<n; j++){
                if(arr[j]!=arr[j-1]+1){
                    flag = false;
                    break;
                }
            }
            if(flag)ans[i] = arr[i+k-1];
        }
        return ans;
    }
}
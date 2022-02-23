class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];
        int prev = arr[0];
        int curr = 1;
        int max = prev;
        for(int i=1; i<n; i++){
            if(prev!=0)
                curr = prev*arr[i];
            else
                curr = arr[i];
            prev= curr;
            max = Math.max(max,curr);
        }
        prev = arr[n-1];
        max = Math.max(max,prev);
        for(int i=n-2; i>0; i--){
            if(prev!=0)
                curr = prev*arr[i];
            else
                curr = arr[i];
            prev= curr;
            max = Math.max(max,curr);
        }
        return max;
    }
}
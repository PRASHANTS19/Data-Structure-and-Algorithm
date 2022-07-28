class Solution {
    public int kthSmallest(int[][] arr, int k) {
        int n = arr.length;
        int m = arr[0].length;
        
        int lo=arr[0][0];int hi=arr[n-1][m-1]+1;
        
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            int count=0,j=m-1;
            for(int i=0; i<n; i++){
                while(j>=0 && arr[i][j]>mid)j--;
                count += (j+1);
            }
            if(count<k)lo = mid+1;
            else hi = mid;
        }
        return lo;
    }
}
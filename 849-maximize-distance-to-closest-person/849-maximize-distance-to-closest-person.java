class Solution {
    public int maxDistToClosest(int[] arr) {
        int i=0;
        int j=i+1;
        int n=arr.length;
        int res = 0;
        
        while(i<n && j<n){
            if(arr[j]==1){
                if(arr[i]==1){
                    res = Math.max(res,(j-i)/2);
                }        
                else if(arr[i]==0){
                    res = Math.max(res,j-i);
                }
                i=j;
            }
            j++;
        }
        if(arr[n-1]==0){
            res = Math.max(res,n-1-i);
        }
        return res;
    }
}
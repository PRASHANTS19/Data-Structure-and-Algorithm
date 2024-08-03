class Solution {
    public int search(int[] arr, int t) {
        
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==t)return m;
            if(arr[m]>t)e=m-1;
            else s = m+1;
        }
        return -1;
    }
}
class Solution {
    public int[] searchRange(int[] arr, int target) {
        int ind1 = -1;
        int l=0; int r = arr.length-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                ind1 = mid;
                r=mid-1;
            }
            else if(arr[mid]>target)r=mid-1;
            else l=mid+1;
        }
        int res[] = new int[2];
        res[0]=ind1;
        ind1=-1;
        l=0; r = arr.length-1;
         while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                ind1 = mid;
                l=mid+1;
            }
            else if(arr[mid]>target)r=mid-1;
            else l=mid+1;
        }
        res[1]=ind1;
        return res;
        
    }
}
class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int first = -1;
        int l=0,r=arr.length-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                first = mid;
                r=mid-1;
            }
            else if(arr[mid]<target)
                l=mid+1;
            else r=mid-1;
        }
        l=0; r=arr.length-1;
        int last = -1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                last = mid;
                l=mid+1;
            }
            else if(arr[mid]<target)
                l=mid+1;
            else r=mid-1;
        }
        return new int[]{first,last};
    }
}
class Solution {
    public int search(int[] arr, int target) {
       int n=arr.length;
       if(n==1 && arr[0]==target)return 0;
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>=arr[low]){
                if(target<=arr[mid] && target>=arr[low])high = mid-1;
                else low = mid+1;
            }
            else if(arr[mid]<=arr[high]){
                if(target>=arr[mid] && target<=arr[high])low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}
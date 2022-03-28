class Solution {
    public boolean search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)return true;
            
            else if(arr[mid]<arr[high]||arr[mid]<arr[low]){
                if(target>arr[mid] && target<=arr[high])
                    low = mid+1;
                else high = mid-1;
            }
            else if(arr[mid]>arr[low]||arr[mid]>arr[high]){
                if(target>=arr[low] && target<arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else high--;
        }
        return false;
    }
}
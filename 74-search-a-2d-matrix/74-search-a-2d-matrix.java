class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
       int m =arr.length;
       int n = arr[0].length;
       if(n == 0) return false;
        
       int low = 0;
       int high = m*n-1;
       
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid/n][mid%n]<target){
                low = mid+1; 
            }
            else if(arr[mid/n][mid%n]>target){
                high = mid-1;
            }
            else
                return true;
        }
        return false;
        
    }
}
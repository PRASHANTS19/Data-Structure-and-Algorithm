class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[] = new int[2*n];
        int k=0;
        int i=0;
        while(i<n && k<2*n){
            arr[k] = nums[i++];
            k += 2;
        }
        k=1;
        while(i<2*n && k<2*n){
            arr[k]=nums[i++];
            k +=2;
        }
        
        return arr;
        
        
    }
}
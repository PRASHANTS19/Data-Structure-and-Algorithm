class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        if(k==0)return;
        
        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);
     }
    void reverse(int start,int end,int[] arr){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
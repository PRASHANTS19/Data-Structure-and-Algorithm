class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        
        int m = arr1.length;
        int n = arr2.length;
        int i=0,j=0,k=0;
        int arr[] = new int[m+n];
        
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }
            else arr[k++]=arr2[j++];
        }
        while(i<m){
            arr[k++] = arr1[i++];
        }
        while(j<n){
            arr[k++] = arr2[j++];
        }
        
        if((m+n)%2!=0){
            return arr[(m+n)/2];
        }
        return (arr[(m+n)/2]+arr[(m+n)/2-1])/2.0;
    }
}
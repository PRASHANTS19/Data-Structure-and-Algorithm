class Solution {
    public int[] sortArray(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        
        mergeSort(arr,l,r);
        return arr;
    }
    void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    void merge(int arr[],int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=0;
        int temp[] = new int[r-l+1];
        
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        
        while(j<=r)
            temp[k++]=arr[j++];
        
        for(int x=l; x<=r; x++)
            arr[x] = temp[x-l];    
    }
}
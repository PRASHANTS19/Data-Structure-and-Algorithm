class Solution {
    public int[] sortArray(int[] arr) {
        
        int l=0;
        int h=arr.length-1;
        quickSort(arr,l,h);
        return arr;
    }
    void quickSort(int arr[],int l,int h){
        
        if(l<h){
            int pivot=partition(arr,l,h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }
    int partition(int arr[],int l,int h){
        int i=l;
        int j=h;
        int pivot=arr[l];
        
        while(i<j){
            while(arr[i]<=pivot && i<h)i++;
            while(arr[j]>pivot && j>=l)j--;
            if(i<j)
                swap(arr,i,j); 
        }
        swap(arr,l,j);
        return j;  //returning the pivot;
        
        
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
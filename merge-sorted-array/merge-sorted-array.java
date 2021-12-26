class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int size = n+m-1;
        int i=m-1;
        int j=n-1;
        
        while(i>=0 && j>=0){
            if(num2[j]>num1[i]){
                swap(num2,j,num1,size);
                size--;j--;
            }
            else{
                swap(num1,i,num1,size);
                size--; i--;
            }
        }
        while(size>=0 && j>=0){
            swap(num2,j,num1,size);
            j--; size--;
        }
    }
    void swap(int[]arr1,int i, int[] arr2,int j){
        int x = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = x;
    }
}
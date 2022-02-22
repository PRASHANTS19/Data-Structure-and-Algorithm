class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        if(n==1 && arr[0]!=1)return 1;
        int j=0;
        boolean flag = false;
        
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                flag = true;
                break;
            }
        }
        if(flag == false)return 1;
        while(j<n){
            if(arr[j]>0 && arr[j]<=n && arr[arr[j]-1]!=arr[j]){
                swap(arr, j, arr[j]-1);
            }
            else j++;
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=i+1)return i+1;
        }
        return n+1;
    }
     private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
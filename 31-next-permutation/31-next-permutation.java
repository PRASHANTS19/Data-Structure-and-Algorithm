class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        if(pivot==-1)Arrays.sort(arr);
        else{
            for(int i=n-1; i>=0; i--){
                if(arr[i]>arr[pivot]){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
            int i=pivot+1;
            int j=n-1;
            
            while(i<=j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j--;
            }
        }
    }
}

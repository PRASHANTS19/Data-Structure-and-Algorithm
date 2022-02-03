class Solution {
    public String getPermutation(int n, int k) {
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i+1;
        }
        for(int i=0; i<k-1; i++){
            nextPermutation(arr);
        }
        String res = "";
        for(int i=0; i<n; i++) {
    		res += Integer.toString(arr[i]);
    	}
    	return(res);
    }
     public void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            if(arr[i+1]>arr[i]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1)Arrays.sort(arr);
        else{
            for(int i=n-1; i>=0; i--){
                if(arr[i]>arr[pivot]){
                    int x = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = x;
                    break;
                }
            }
        
        int i = pivot+1;
        int j = n-1;
        while(i<j){
            int x = arr[j];
            arr[j] = arr[i];
            arr[i] = x;
            i++; j--;
        }
        }
        
    }

}
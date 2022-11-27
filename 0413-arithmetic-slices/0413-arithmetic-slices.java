class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        
        int count = 0,n= arr.length;
        for(int i=0; i<n-1; i++){
            int diff = arr[i+1]-arr[i];
            for(int j=i+1; j<n; j++){
                if(arr[j]-arr[j-1]==diff){
                    if((j-i+1)>=3 )count++;
                }
                else break;
            }
        }
        return count;
    }
}
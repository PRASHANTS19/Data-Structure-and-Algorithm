class Solution {
    public int maxScore(int[] value, int k) {
        int j = value.length-1;
        int i=0;
        int n = value.length;
        int arr[]  =new int[n];
        arr[0] = value[0];
        for(int x=1; x<value.length; x++){
            arr[x] = arr[x-1]+value[x];
        }
        int sum = 0;
        while(i<=j&&k>0){
            if(i+k-1<n && j-k+1>0){
                if((arr[i+k-1]-arr[i]+value[i])< (arr[j]-arr[j-k+1]+value[j-k+1])){
                    sum += value[j];
                    j--;
                }
                else{
                    sum += value[i];
                    i++;
                }
            }
            else{
                if(arr[i]>arr[j]){
                    sum += value[i];
                    i++;
                }
                else{
                    sum += value[j];
                    j--;
                }
            }
            k--;
        }
        return sum;
    }
}
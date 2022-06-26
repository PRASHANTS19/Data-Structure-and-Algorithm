class Solution {
    public boolean checkPossibility(int[] arr) {
        
        int n = arr.length;
        int count = 0;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                count++;
                if(i-2<0||arr[i]>=arr[i-2])arr[i-1]=arr[i];
                else arr[i] = arr[i-1];
            }
        }
        if(count>1)return false;
        return true;
    }
}
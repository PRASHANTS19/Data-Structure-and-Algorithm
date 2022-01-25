class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3)return false;
         boolean flag = false;
        for(int i=0; i<n-1; i++){
            if(flag == false){
                if(arr[i]<arr[i+1])continue;
                else if(i==0)return false;
                else flag = true;
            }   
            else{
                if(arr[i]>arr[i+1])continue;
                else return false;
            }
        }
        if(arr[n-1]==arr[n-2] ||arr[n-2]<arr[n-1])return false;
        return true;
        
        
    }
}
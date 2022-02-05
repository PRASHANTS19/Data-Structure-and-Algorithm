class Solution {
    public int singleNonDuplicate(int[] arr) {
         if(arr.length==1)return arr[0];
        int l = 0; int r = arr.length-1;
    
       int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
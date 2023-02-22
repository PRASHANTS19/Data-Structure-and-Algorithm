class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        int num = arr[0];
        
        for(int i=1; i<arr.length; i++){
            num = arr[i]^num;
        }
        return num;
    }
}
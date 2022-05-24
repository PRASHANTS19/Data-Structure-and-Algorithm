class Solution {
    public int[] singleNumber(int[] arr) {
        
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }
        int mask = xor & -xor;
        
        int first = 0;
        int second = 0;
        
        for(int i=0; i<arr.length; i++){
            if((mask&arr[i]) == mask){
                first = first^arr[i];
            }
            else{
                second = second^arr[i];
            }
        }
        
        return new int[]{first,second};
        
    }
}
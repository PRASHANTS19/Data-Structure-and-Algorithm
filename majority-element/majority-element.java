class Solution {
    public int majorityElement(int[] arr) {
       int num = arr[0];
        int count= 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==num)count++;
            else count--;
            
            if(count == 0){
                num = arr[i];
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num)count++;
        }
        if(count>arr.length/2)return num;
        
        return -1;
    }
}
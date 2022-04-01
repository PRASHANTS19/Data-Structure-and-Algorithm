class Solution {
    public void reverseString(char[] s) {
      
        int start = 0;
        int end = s.length-1;
        
        reverse(s , start , end);
        
    }
    static void reverse(char[] arr , int start , int end){
         if(start>end){
           return;
       }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        reverse(arr, ++start, --end);
    }
}
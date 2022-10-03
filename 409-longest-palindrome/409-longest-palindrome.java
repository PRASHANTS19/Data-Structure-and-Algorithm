class Solution {
    public int longestPalindrome(String s) {
        
        int arr[] = new int[125];
        
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)]++; 
        }
        
        boolean odd = false;
        int len = 0;
        for(int i=0; i<125; i++){
            if(arr[i]!=0)
                len+=(arr[i]/2)*2;
            if(arr[i]%2!=0)odd=true;
            
        }
        
        return odd?len+1:len;
    }
}
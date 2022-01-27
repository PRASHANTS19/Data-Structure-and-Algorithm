class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int arr[] = new int[200];
        int i = 0;  int j=0; 
        int count = 0;
        
        while(i<s.length()){
            if(arr[s.charAt(i)]!=0){
                count = Math.max(count,i-j);
                while(j<i && arr[s.charAt(i)]!=0){
                    arr[s.charAt(j)]--;
                    j++;
                }
                arr[s.charAt(i)]++;
            }
            else{
                arr[s.charAt(i)]++;
            }
            i++;
        }
        count = Math.max(count,i-j);
        return count;
    }
}
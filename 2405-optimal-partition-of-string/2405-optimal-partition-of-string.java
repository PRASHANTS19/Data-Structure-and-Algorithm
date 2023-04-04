class Solution {
    public int partitionString(String s) {
        
        int arr[] = new int[26];
        int count = 1;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            
            boolean flag = false;
            for(int j=0; j<26; j++){
                if(arr[j]>1){
                    flag = true;
                    break;
                }
            }
            if(flag){
                Arrays.fill(arr,0);
                count++;
                arr[s.charAt(i)-'a']++;
            }
        }
        
        return count;
            
            
    }
}
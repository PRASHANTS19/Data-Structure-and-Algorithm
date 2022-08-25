class Solution {
    public boolean canConstruct(String str, String mag) {
        int arr[] = new int[26];
        for(int i=0; i<mag.length(); i++){
            char c = mag.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(arr[c-'a']<=0)return false;
            arr[c-'a']--;
        }
        return true;
    }
}
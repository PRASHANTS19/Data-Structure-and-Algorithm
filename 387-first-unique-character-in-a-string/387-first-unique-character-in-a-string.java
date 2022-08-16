class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[300];
        for(int i=0; i<s.length(); i++){
            int x = s.charAt(i);
            arr[x]++;
        }
        for(int i=0; i<s.length(); i++){
            int x = s.charAt(i);
            if(arr[x]==1)return i;
        }
        return -1;
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(n==0)return 0;
        if(haystack.contains(needle)==false || n>m)return -1;
        int j=0;
        
        for(int i=0; i<m; i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j=i; boolean flag = true;
                for(int k=0; k<needle.length(); k++){
                    if(haystack.charAt(j)!=needle.charAt(k)){
                        flag = false;
                        break;
                    }
                    else j++;
                }
                if(flag){
                    return i;
                }
                j=0;
            }
        }
        return 1;
    }
}
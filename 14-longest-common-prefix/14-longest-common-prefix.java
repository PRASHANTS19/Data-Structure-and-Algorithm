class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        if(n==0)return "";
        if(n==1)return arr[0];
        
        StringBuilder res = new StringBuilder();
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i)==last.charAt(i)){
                res.append(first.charAt(i));
            }
            else break;
        }
    return res.toString();        
        
    }
}
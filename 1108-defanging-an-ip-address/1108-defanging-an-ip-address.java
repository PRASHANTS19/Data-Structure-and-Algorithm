class Solution {
    public String defangIPaddr(String address) {
        
        String arr[] = address.split("\\.");
        String res = "";
        for(int i=0; i<arr.length-1; i++){
            res += arr[i]+"[.]";
        }
        res += arr[arr.length-1];
        
        return res;
    }
}
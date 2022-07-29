class Solution {
    public String defangIPaddr(String address) {
        
        String arr[] = address.split("\\.");
        StringBuilder res = new StringBuilder();
        for(int i=0; i<arr.length-1; i++){
            res.append(arr[i]+"[.]");
        }
        res.append(arr[arr.length-1]);
        
        return res.toString();
    }
}
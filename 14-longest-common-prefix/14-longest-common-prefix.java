class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        if(n==0)return "";
        if(n==1)return arr[0];
        
        String common = "";
        int i=0; int j=0;
        while(i<arr[0].length() && j<arr[1].length()){
            if(arr[0].charAt(i)==arr[1].charAt(j))common += arr[0].charAt(i);
            else break;
            i++; j++;
        }
        i=0;
       
        for(i=2; i<n; i++){
            String res = "";
            j=0; int k=0;
            while(j<arr[i].length() && k<common.length()){
                if(arr[i].charAt(j)==common.charAt(k))res += arr[i].charAt(j);
                j++; k++;
            }
            common = res;
        }
    return common;        
        
    }
}
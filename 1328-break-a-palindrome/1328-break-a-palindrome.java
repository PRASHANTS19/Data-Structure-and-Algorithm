class Solution {
    public String breakPalindrome(String s) {
        if(s.length()==1)return "";
        
        int n = s.length();
        
        boolean flag = false;
        
        char arr[] = s.toCharArray();
        int a = 0;
        for(char c : arr){
            if(c=='a')a++;
        }
        if(a==n-1){
            arr[n-1]='b';
        }
        else{
            for(int i=0; i<arr.length; i++){
            if(arr[i]!='a'){
                arr[i]='a';
                flag = true;
                break;
            }
            }
            if(flag==false){
                arr[arr.length-1]='b';
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(char c : arr){
            res.append(c);
        }
        return res.toString();
    }
}
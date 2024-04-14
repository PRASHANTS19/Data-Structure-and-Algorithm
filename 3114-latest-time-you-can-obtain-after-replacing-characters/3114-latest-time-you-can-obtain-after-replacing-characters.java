class Solution {
    public String findLatestTime(String s) {
        char arr[] = s.toCharArray();
        
        if(arr[0]=='?' && arr[1]=='?'){
            arr[0]='1';
            arr[1]='1';
        }
        if(arr[0]=='?' && (arr[1]=='1'||arr[1]=='0'))arr[0]='1';
        if(arr[0]=='?' && arr[1]!='1' && arr[1]!='0')arr[0]='0';
        
        if(arr[0]=='0' && arr[1]=='?')arr[1] = '9';
        if(arr[0]=='1' && arr[1]=='?')arr[1] = '1';
        
        if(arr[3]=='?')arr[3]='5';
        if(arr[4]=='?')arr[4]='9';
        
        String ans = "";
        
        for(char c : arr)ans += c;
        
        return ans;
        
    }
}
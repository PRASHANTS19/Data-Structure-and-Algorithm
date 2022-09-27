class Solution {
    public String pushDominoes(String d) {
        
        int n = d.length();
        int left[] = new int[n];
        int right[] = new int[n];
        
        
        right[0] = d.charAt(0)=='R'?1:0;
        
        for(int i=1; i<n; i++){
            if(d.charAt(i)=='.' && right[i-1]!=0){
                right[i] = right[i-1]+1;
            }
            else if(d.charAt(i)=='R')right[i]=1;
        }
        
        left[n-1]= d.charAt(n-1)=='L'?1:0;
        
        for(int i=n-2; i>=0; i--){
            if(d.charAt(i)=='.' && left[i+1]!=0){
                left[i] = left[i+1]+1;
            }
            else if(d.charAt(i)=='L')left[i]=1;
        }
        
        char arr[] = new char[n];
        for(int i=0; i<n; i++){
            if(left[i]==0 && right[i]==0)arr[i]='.';
            else if(left[i]==0 && right[i]!=0)arr[i]='R';
            else if(left[i]!=0 && right[i]==0)arr[i]='L';
            else{
                if(left[i]>right[i])arr[i]='R';
                else if(left[i]<right[i])arr[i]='L';
                else arr[i]='.';
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c : arr){
            res.append(c);
        }
        return res.toString();
        
    }
}
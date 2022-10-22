class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();
        if(t.length()>n)return "";
        int freq[] = new int[80];
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)-'A']++;
        }
        int arr[] = new int[80];
        
       int i=0,j=0,left=-1,right=-1,min=Integer.MAX_VALUE;
        
        for(i=0; i<t.length(); i++){
            arr[s.charAt(i)-'A']++;
        }
       
        while(i<n){
            boolean flag = true;
            for(int k=0; k<80; k++){
                if(arr[k]<freq[k]){
                    flag= false;
                    break;
                }
            }
            if(flag){
                if(min>i-j){
                    min = i-j;
                    left = j;
                    right = i;
                }
                arr[s.charAt(j)-'A']--;
                j++;
            }
            else{
                arr[s.charAt(i)-'A']++;
                i++;
            }
        }
        while(j<n){
            boolean flag = true;
            for(int k=0; k<80; k++){
                if(arr[k]<freq[k]){
                    flag= false;
                    break;
                }
            }
            if(flag){
                if(min>i-j){
                    min = i-j;
                    left = j;
                    right = i;
                }
                arr[s.charAt(j)-'A']--;
                j++;
            }
            else break;
        }
        
        if(min==Integer.MAX_VALUE)return "";
        // System.out.print(i + " " + j);
        return s.substring(left,right);
       
    }
}
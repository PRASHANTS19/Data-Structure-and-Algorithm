class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length()<s1.length())return false;
        
        int arr[] = new int[26];
        
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)-'a']++;
        }
        
        int n = s1.length();
         
        int a[] = new int[26];
        
        for(int i=0; i<n; i++){
            a[s2.charAt(i)-'a']++;
        }
    
        if(check(arr,a))return true;
        
        int i=0; int j=n;
        
        while(j<s2.length()){
            a[s2.charAt(j++)-'a']++;
            a[s2.charAt(i++)-'a']--;
            
            if(check(arr,a))return true;
        }
        return false;
        
        
    }
    boolean check(int arr[],int a[]){
        boolean flag = true;
        for(int i=0; i<26; i++){
            if(a[i]!=arr[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        int n1 = s1.length();
        int n2 = s2.length();
        
        if(n1>n2)return false;
        int arr[] = new int[27];
        for(int i=0; i<n1; i++){
            arr[s1.charAt(i)-'a']++;
        }
        
        int dummy[] = new int[27];
        for(int i=0; i<n1; i++){
            dummy[s2.charAt(i)-'a']++;
        }
        boolean flag = true;
        for(int i=0; i<27; i++){
            if(arr[i]!=dummy[i]){
                flag = false;
                break;
            }
        }
        if(flag)return true;
        int j = 0;
        for(int i=n1; i<n2; i++){
            dummy[s2.charAt(i)-'a']++;
            dummy[s2.charAt(j++)-'a']--;
            flag = true;
        for(int k=0; k<27; k++){
            if(arr[k]!=dummy[k]){
                flag = false;
                break;
            }
        }
        if(flag)return true;
        }
    return flag;
    }
}
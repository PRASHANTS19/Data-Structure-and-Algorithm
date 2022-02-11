class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1>n2)return false;
        
        int arr1[] = new int[27];
        for(int i=0; i<n1; i++){
            arr1[s1.charAt(i)-'a']++;
        }
        int arr2[] = new int[27];
        
        for(int i=0; i<n1; i++){
            arr2[s2.charAt(i)-'a']++;
        }
        int j=0;  boolean flag = true;
        for(int i=n1; i<=n2; i++){
            for(int k=0; k<27; k++){
                if(arr1[k]!=arr2[k]){
                    flag = false;
                    break;
                }
            }
            if(flag == true)return true;
            flag = true;
            if(i==n2)break;
            arr2[s2.charAt(i)-'a']++;
            arr2[s2.charAt(j++)-'a']--;
            
        }
        return false; 
    }
}
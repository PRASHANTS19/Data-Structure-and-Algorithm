class Solution {
    public int compareVersion(String ver1, String ver2) {
        
        String v1[] = ver1.split("\\.");
        String v2[] = ver2.split("\\.");
        
        int n1= v1.length;
        int n2= v2.length;
        int i=0,j=0;
        
        while(i<n1 && j<n2){
            if(Integer.parseInt(v1[i])>Integer.parseInt(v2[j]))return 1;
            else if(Integer.parseInt(v1[i])<Integer.parseInt(v2[j]))return -1;
            i++; j++;
        }
        if(n1==n2)return 0;
        
        if(n1>n2){
            while(i<n1){
                if(Integer.parseInt(v1[i])!=0)return 1;
                
                i++;
            }
        }
        else{
            while(j<n2){
                if(Integer.parseInt(v2[j])!=0)return -1;
                
                j++;
            }
        }
        return 0;
    }
}
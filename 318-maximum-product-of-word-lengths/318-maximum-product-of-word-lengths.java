class Solution {
    public int maxProduct(String[] arr) {
        int max = 0;
        
        for(int i=0; i<arr.length-1; i++){
            String one =arr[i];
            for(int j=i+1; j<arr.length; j++){
                 String two = arr[j];
                if(common(one,two)==false)
                    max = Math.max(max,one.length()*two.length());
            }
        }
        return max;
    }
    boolean common(String one,String two){
        int arr1[] = new int[27];
        int arr2[] = new int[27];
        
        for(int i=0; i<one.length(); i++){
            arr1[one.charAt(i)-'a']++;
        }
        for(int i=0; i<two.length(); i++){
            arr2[two.charAt(i)-'a']++;
        }
        
        for(int i=0; i<27; i++){
            if(arr1[i]>0 && arr2[i]>0)return true;
        }
        return false;
    }
}
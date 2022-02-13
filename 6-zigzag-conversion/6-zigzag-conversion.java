class Solution {
    public String convert(String str, int row) {
        String[] arr = new String[row];
        int n = str.length();
        if(n==1 || row==1)return str;
        int k=0; boolean flag = true;
        for(int i=0; i<n; i++){
            if(arr[k]==null)arr[k] = Character.toString(str.charAt(i));
            else arr[k] += str.charAt(i); 
            if(flag == true){
                // if(arr[k]==null)arr[k] = Character.toString(str.charAt(i));
                // else arr[k] += str.charAt(i); 
                if(k==arr.length-1){
                    flag = false;
                    k=arr.length-(i%k)-2;
                }
                else{
                    k++;
                }
            }
            else{
                // arr[k] += str.charAt(i); 
                if(k==0){
                    flag = true;
                    k++;
                }
                else{
                    k--;
                }
            }
            
        }
        String res ="";
        for(int i=0; i<row; i++){
            if(arr[i]!=null)
                res += arr[i];
        }
        return res;
    }
}
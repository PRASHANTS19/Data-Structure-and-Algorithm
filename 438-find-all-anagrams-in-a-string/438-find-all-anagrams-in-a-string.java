class Solution {
    public List<Integer> findAnagrams(String str, String aux) {
        
        int dummy[] = new int[130];
        int n = aux.length();
        List<Integer> list = new ArrayList<>();
        if(n>str.length())return list;
        for(int i=0; i<n; i++){
            dummy[aux.charAt(i)]++;
        }
        int arr[] = new int[130];
        for(int i=0; i<n; i++){
            arr[str.charAt(i)]++;
        }
        boolean flag = true;
        for(int i=0; i<130; i++){
            if(arr[i]!=dummy[i]){
                flag = false;
                break;
            }
        }
        if(flag==true)list.add(0);
        arr[str.charAt(0)]--;
        int j=1;
        for(int i=n; i<str.length(); i++){
            arr[str.charAt(i)]++;
            flag=true;
            for(int k=0; k<130; k++){
                if(arr[k]!=dummy[k]){
                    flag = false;
                    break;
                }
            }
            if(flag==true)list.add(i-n+1);
            arr[str.charAt(j++)]--;
          }
        return list;
    }
}
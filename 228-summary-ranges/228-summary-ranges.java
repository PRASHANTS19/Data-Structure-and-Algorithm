class Solution {
    public List<String> summaryRanges(int[] arr) {
         List<String> list = new ArrayList<>();
        int n = arr.length;
        if(n==0)return list;
        if(n==1){
         list.add(Integer.toString(arr[0]));
         return list;
        }
        String str = Integer.toString(arr[0]);
        for(int i=0; i<n-1; i++ ){
            if(arr[i+1]-arr[i]!=1){
                if(Integer.parseInt(str)==arr[i]){
                    list.add(str);
                }
                else{
                    str += "->"+Integer.toString(arr[i]);
                    list.add(str);
                }
                str = Integer.toString(arr[i+1]);
            }
            else continue;
        }
        if(Integer.parseInt(str)==arr[n-1]){
            list.add(str);
        }
        else{
            str +=  "->"+Integer.toString(arr[n-1]);
            list.add(str);
        }
        return list;
    }
}
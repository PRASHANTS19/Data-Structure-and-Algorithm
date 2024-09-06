class Solution {
    public boolean canAliceWin(int[] arr) {
        
        Arrays.sort(arr);
        
        long single = 0;
        long d = 0;
        long total = 0;
        for(int i=0; i<arr.length; i++){
            if(Integer.toString(arr[i]).length()==1)single+=arr[i];
            if(Integer.toString(arr[i]).length()==2)d+=arr[i];
        }
        
        if(single==d)return false;
        return true;
    }
}
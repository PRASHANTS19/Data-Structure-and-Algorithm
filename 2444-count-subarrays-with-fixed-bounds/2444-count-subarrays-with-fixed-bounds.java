class Solution {
    public long countSubarrays(int[] arr, int mink, int maxk) {
        long ans = 0;
        int mini=0,maxi=0,c=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==mink)mini=i;
            if(arr[i]==maxk)maxi=i;
            if(arr[i]<mink || arr[i]>maxk){
                c=i+1;
                mini=maxi=i;
            }
            if(arr[mini]==mink && arr[maxi]==maxk){
                ans += Math.min(mini-c,maxi-c)+1;
            }

        }
            return ans;        
    }
}
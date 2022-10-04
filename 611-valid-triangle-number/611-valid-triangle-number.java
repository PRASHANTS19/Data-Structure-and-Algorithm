class Solution {
    public int triangleNumber(int[] arr) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int count=0;
        for(int i=n-1; i>=0; i--){
            int l=0,r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count += r-l;
                    r--;
                }
                else l++;
            }
        }
        return count;
    }
    
    
}
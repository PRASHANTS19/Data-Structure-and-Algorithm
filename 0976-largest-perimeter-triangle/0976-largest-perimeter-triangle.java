class Solution {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        for(int i=n-1; i>=2; i--){
            if(arr[i]<arr[i-1]+arr[i-2]){
                return arr[i]+arr[i-1]+arr[i-2];
            }
        }
        return 0;
    }
}
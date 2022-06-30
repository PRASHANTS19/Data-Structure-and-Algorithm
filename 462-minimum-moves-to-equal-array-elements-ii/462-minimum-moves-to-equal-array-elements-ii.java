class Solution {
    public int minMoves2(int[] arr) {
        int n = arr.length;
        
        Arrays.sort(arr);
        // int c1 = 0;
        
            int c1 = 0;
            int num = arr[n/2];
            for(int i=0; i<n; i++){
                c1+= Math.abs(arr[i]-num);
            }
        return c1;
    }
}
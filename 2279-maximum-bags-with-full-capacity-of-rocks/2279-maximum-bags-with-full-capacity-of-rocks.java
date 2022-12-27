class Solution {
    public int maximumBags(int[] c, int[] rocks, int ar) {
        int n = c.length;
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = c[i]-rocks[i];
        }
        Arrays.sort(arr);
        int count = 0;
        
        for(int i=0; i<n; i++){
            ar = ar-arr[i];
            if(ar<0)break;
            else count++;
        }
        return count;
    }
}
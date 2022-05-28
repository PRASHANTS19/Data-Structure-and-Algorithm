class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        int sum = 0;
        for(int x : arr)
            sum += x;
        
        return (n*(n+1)/2)-sum;
    }
}
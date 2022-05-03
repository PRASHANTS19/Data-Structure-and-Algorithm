class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int n = arr.length;   
        if(n==1||n==0)return 0;
        
       int start = -1;
        int end = -2;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            max = Math.max(max,arr[i]);
            if(arr[i]<max)end = i;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--)
        {
            min = Math.min(min,arr[i]);
            if(arr[i]>min)start = i;
        }
        return end-start+1;
    }
}
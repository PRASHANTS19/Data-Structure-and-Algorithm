class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(p,q)->p[1]==q[1]?q[0]-p[0]:p[1]-q[1]);
        
        int count = 0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int j=i+1;
            while(j<n && arr[i][1]>arr[j][0]){
                j++;
                count++;
            }
            i=j-1;
        }
        return count;
    }
}
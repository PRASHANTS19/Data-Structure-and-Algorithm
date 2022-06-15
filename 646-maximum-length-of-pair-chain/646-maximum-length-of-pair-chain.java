class Solution {
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr,(p,q)->p[1]-q[1]);
        
        int count = 1;
        int i=1,j=0;
        
        while(i<arr.length){
            if(arr[i][0]>arr[j][1]){
                count++;
                j=i;
            }
            i++;
        }
        return count;
        
    }
}
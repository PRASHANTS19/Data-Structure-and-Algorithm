class Solution {
    public int maximumUnits(int[][] arr, int size) {
        
        Arrays.sort(arr,(p,q)->q[1]-p[1]);
        int count= 0;
        
        for(int i=0; i<arr.length; i++){
            if(size>=arr[i][0]){
                count += arr[i][0]*arr[i][1];
                size -= arr[i][0];
            }
            else if(size>0){
                count+= size*arr[i][1];
                size -= arr[i][0];
            }
            if(size<=0)break;
        }
        return count;
    }
}
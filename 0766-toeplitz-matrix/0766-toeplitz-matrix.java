class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int r=arr.length;
        int c = arr[0].length;
        
        for(int x=0; x<r; x++){
            int i=x+1,j=1;
            while(i<r && j<c){
                if(arr[i-1][j-1]!=arr[i][j]){
                    return false;
                }
                i++;j++;
            }
        }
        for(int x=0; x<c; x++){
            int i=1,j=x+1;
            while(i<r && j<c){
                if(arr[i-1][j-1]!=arr[i][j]){
                    return false;
                }
                i++;j++;
            }
        }
        return true;
    }
}
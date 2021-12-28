class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int n = 0;
       for(int i=0; i<row; i++){
           if(target<=arr[i][col-1]){
               n = i;
               break;
           }
       }
        for(int i=0; i<col; i++){
            if(arr[n][i]==target){
                return true;
            }
        }
        return false;
    }
}
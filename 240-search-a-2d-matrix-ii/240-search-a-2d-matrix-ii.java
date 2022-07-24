class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        int row=0,col=arr[0].length-1;
        
        while(col>=0 && row<arr.length){
            if(arr[row][col]==target)return true;
            else if(target<arr[row][col])col--;
            else row++;
        }
        return false;
    }
}
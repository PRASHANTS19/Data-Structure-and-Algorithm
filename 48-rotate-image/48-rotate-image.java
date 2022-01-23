class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose the matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int x = matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=x;
            }
        }
        int start = 0;
        int end = n-1;
        //just swap each row
        for(int i=0; i<n; i++){
            while(start<end){
                int x = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=x;
                start++; end--;
            }
            start=0;
            end=n-1;
        }
    }
}
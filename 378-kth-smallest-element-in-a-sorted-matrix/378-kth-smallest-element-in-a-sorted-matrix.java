class Solution {
    public int kthSmallest(int[][] matrix, int k) {
     
        int m = matrix.length,n=matrix[0].length;
        int arr[] =  new int[m*n];
        int x=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[x++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
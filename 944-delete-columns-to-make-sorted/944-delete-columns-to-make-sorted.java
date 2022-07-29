class Solution {
    public int minDeletionSize(String[] arr) {
        
        int n = arr.length;
        int m = arr[0].length();
        
        int matrix[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            String s = arr[i];
            for(int j=0; j<m; j++){
                matrix[i][j] = (int)s.charAt(j);
            }
        }
        int count=0;
        for(int j=0; j<m; j++){
            for(int i=0; i<n-1; i++){
                if(matrix[i][j]>matrix[i+1][j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
class neighborSum {
    int n;
    int arr[][];
    public neighborSum(int[][] grid) {
        n = grid.length;
        arr = grid;
    }
    
    public int adjacentSum(int value) {
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==value){
                   if(i-1>=0)sum += arr[i-1][j];
                    if(i+1<n)sum += arr[i+1][j];
                    if(j-1>=0)sum+= arr[i][j-1];
                    if(j+1<n)sum += arr[i][j+1];
                    return sum;
                }
            }
        }
        return -1;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==value){
                   if(i-1>=0 && j-1>=0)sum += arr[i-1][j-1];
                    if(i+1<n && j-1>=0)sum += arr[i+1][j-1];
                    if(i+1<n && j+1<n)sum+= arr[i+1][j+1];
                    if(i-1>=0 && j+1<n)sum += arr[i-1][j+1];
                    return sum;
                }
            }
        }
        return -1;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
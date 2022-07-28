class Solution {
    public void setZeroes(int[][] arr) {
        
        boolean row = false,col = false;
        int n = arr.length;
        int m = arr[0].length;
        
        for(int i=0; i<n; i++){
            if(arr[i][0]==0){
                col = true;
                break;
            }
        }
        for(int i=0; i<m; i++){
            if(arr[0][i]==0){
                row = true;
                break;
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(arr[i][0]==0 || arr[0][j]==0)
                    arr[i][j]=0;
            }
        }
        if(row){
            for(int i=0; i<m; i++)
                arr[0][i]=0;
        }
        if(col){
            for(int i=0; i<n; i++)
                arr[i][0]=0;
        }
    }
}
class Solution {
    public int numSubmat(int[][] arr) {
        
        int n = arr.length;
        int m = arr[0].length;
        
        int aux[][] = new int[n][m];
        
        
        for(int i=0; i<n; i++){
            int c = 0;
            for(int j=m-1; j>=0; j--){
                if(arr[i][j]==1)
                    c++;
                else c=0;
                
                aux[i][j]=c;
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int x = Integer.MAX_VALUE;
                for(int k=i; k<n; k++){
                    x = Math.min(x,aux[k][j]);
                    ans += x;
                }
            }
        }
        return ans;
    }
}
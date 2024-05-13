class Solution {
    public int matrixScore(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        
        
        for(int i=0; i<n; i++){
            if(arr[i][0]==0){
                for(int j=0; j<m; j++){
                    if(arr[i][j]==0)arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        for(int i=0; i<m; i++){
            int zero = 0,one = 0;
            for(int j=0; j<n; j++ ){
                if(arr[j][i]==0)zero++;
                else one++;
            }
            if(zero>one){
                for(int j=0; j<n; j++ ){
                    if(arr[j][i]==0)arr[j][i]=1;
                    else arr[j][i]=0;
                }
            }
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            int num = 0;
            for(int j=m-1; j>=0; j--){
                // System.out.print(arr[i][j]+"--");
                if(arr[i][j]!=0)
                    num += Math.pow(2,m-j-1);
            }
            // System.out.println("%%"+num+"%%");
            ans += num;
        }
        return ans;
        
    }
}
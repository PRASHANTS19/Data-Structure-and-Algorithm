class Solution {
    public int[][] generateMatrix(int n) {
        int d = 0;
        int arr[][] = new int[n][n];
        int up=0,down=n-1,left=0,right=n-1;
        int count = 1;
        while(count<=n*n){
            if(d==0){
                int x=left;
                while(x<=right){
                    arr[up][x]=count;
                    count++; x++;
                }
                up++; d++;
                d=d%4;
            }
            else if(d==1){
                int x=up;
                while(x<=down){
                    arr[x][right]=count;
                    count++; x++;
                }
                right--; d++;
                d=d%4;
            }
            else if(d==2){
                int x = right;
                while(x>=left){
                    arr[down][x]=count;
                    count++; x--;
                }
                down--; d++;
                d=d%4;
            }
            else if(d==3){
                int x=down;
                while(x>=up){
                    arr[x][left]=count;
                    count++; x--;
                }
                left++; d++;
                d=d%4;
            }
        }
        return arr;
    }
}
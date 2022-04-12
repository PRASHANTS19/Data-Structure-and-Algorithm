class Solution {
    public void gameOfLife(int[][] grid) {
        int m = grid.length;
        int n= grid[0].length;
        
        int arr[][] = new int[m][n];
        if(m==1){
            arr[0][0]=0;
            arr[0][n-1]=0;
            for(int i=1; i<n-1; i++){
                if(grid[0][i-1]==1 && grid[0][i+1]==1 && grid[0][i]==1)arr[0][i]=1;
                else arr[0][i]=0;
            }
        }
        else if(n==1) {
            arr[0][0]=0;
            arr[n-1][0]=0;
            for(int i=1; i<m-1; i++){
                if(grid[i-1][0]==1 && grid[i+1][0]==1 && grid[i][0]==1)arr[i][0]=1;
                else arr[i][0]=0;
            }
        }
        else{
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int count = 0;
                if(i==0){
                    if(j==0){
                       if(grid[i][j+1]==1)count++;
                       if(grid[i+1][j]==1)count++;
                       if(grid[i+1][j+1]==1)count++;
                    }
                    else if(j==n-1){
                       if(grid[i][j-1]==1)count++;
                       if(grid[i+1][j]==1)count++;
                       if(grid[i+1][j-1]==1)count++;
                    }
                    else{
                       if(grid[i][j+1]==1)count++;
                       if(grid[i][j-1]==1)count++;
                       if(grid[i+1][j]==1)count++;
                       if(grid[i+1][j-1]==1)count++;
                       if(grid[i+1][j+1]==1)count++; 
                    }
                }
                else if(i==m-1){
                    if(j==0){
                       if(grid[i][j+1]==1)count++;
                       if(grid[i-1][j]==1)count++;
                       if(grid[i-1][j+1]==1)count++;
                    }
                    else if(j==n-1){
                       if(grid[i][j-1]==1)count++;
                       if(grid[i-1][j]==1)count++;
                       if(grid[i-1][j-1]==1)count++;
                    }
                    else{
                       if(grid[i][j+1]==1)count++;
                       if(grid[i][j-1]==1)count++;
                       if(grid[i-1][j]==1)count++;
                       if(grid[i-1][j-1]==1)count++;
                       if(grid[i-1][j+1]==1)count++; 
                    }
                }
                else if(j==0){
                       if(grid[i][j+1]==1)count++;
                       if(grid[i-1][j]==1)count++;
                       if(grid[i-1][j+1]==1)count++;
                       if(grid[i+1][j]==1)count++;
                       if(grid[i+1][j+1]==1)count++; 
                }
                else if(j==n-1){
                       if(grid[i][j-1]==1)count++;
                       if(grid[i-1][j]==1)count++;
                       if(grid[i-1][j-1]==1)count++;
                       if(grid[i+1][j]==1)count++;
                       if(grid[i+1][j-1]==1)count++; 
                }
                else{
                       if(grid[i][j-1]==1)count++;
                       if(grid[i][j+1]==1)count++;
                       if(grid[i-1][j]==1)count++;
                       if(grid[i+1][j]==1)count++;
                       if(grid[i-1][j-1]==1)count++;
                       if(grid[i-1][j+1]==1)count++;
                       if(grid[i+1][j+1]==1)count++; 
                       if(grid[i+1][j-1]==1)count++; 
                }
            if(count<2)arr[i][j]=0;
            else if((count==2 || count==3)&&grid[i][j]==1)arr[i][j]=1;
            else if(count>3)arr[i][j]=0;
            else if(count==3 && grid[i][j]==0)arr[i][j]=1;
            }
        }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j]=arr[i][j];
            }
        }
    }
}
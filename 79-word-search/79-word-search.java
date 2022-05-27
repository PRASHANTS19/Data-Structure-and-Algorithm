class Solution {
    boolean visited[][];
    public boolean exist(char[][] arr, String word) {
        
        int m = arr.length;
        int n = arr[0].length;
        visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==word.charAt(0)){
                    if(solve(arr,i,j,m,n,word,0))return true;
                }
            }
        }
        return false;
        
    }
    boolean solve(char arr[][],int i,int j,int m,int n,String word,int index){
        if(index == word.length())return true;
        if(i<0||j<0||i>=m||j>=n)return false;
        
        boolean a=false,b=false,c=false,d=false;
        if(arr[i][j]==word.charAt(index) && visited[i][j]==false){
            visited[i][j]=true;
            a = solve(arr,i+1,j,m,n,word,index+1);
            b = solve(arr,i,j+1,m,n,word,index+1);
            c = solve(arr,i-1,j,m,n,word,index+1);
            d = solve(arr,i,j-1,m,n,word,index+1);  
            visited[i][j]=false;
        }
        return a||b||c||d;
    }
}
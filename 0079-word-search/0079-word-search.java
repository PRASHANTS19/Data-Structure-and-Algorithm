class Solution {
    public boolean exist(char[][] arr, String word) {
        
        int m = arr.length;
        int n = arr[0].length;
        
        boolean visited[][] = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==word.charAt(0) && visited[i][j]==false){
                     if(solve(arr,i,j,word,0,visited))return true;
                }
            }
        }
        return false;
    }
    boolean solve(char arr[][],int i,int j,String word,int index,boolean visited[][]){
        if(index==word.length())return true;
        if(i<0||j<0||i>=arr.length||j>=arr[0].length||visited[i][j])return false;
        if(arr[i][j]!=word.charAt(index))return false;
        
        visited[i][j]=true;
        boolean up = solve(arr,i-1,j,word,index+1,visited);
        boolean down = solve(arr,i+1,j,word,index+1,visited);
        boolean left = solve(arr,i,j-1,word,index+1,visited);
        boolean right = solve(arr,i,j+1,word,index+1,visited);
        visited[i][j]=false;
        
        return up||down||left||right;
    }
}
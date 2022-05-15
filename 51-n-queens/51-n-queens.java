class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>matrix = new ArrayList<>();
        char board[][] = new char[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        solve(board,0,matrix);
        return matrix;
        
    }
    void solve(char[][] board,int col,List<List<String>>matrix){
        if(col==board.length){
            List<String> list = new ArrayList<>();
            for(int i=0; i<board.length; i++){
                String s = new String(board[i]);
                list.add(s);
            }
            matrix.add(list);
            return;
        }
        
        for(int i=0; i<board.length; i++){
            if(isSafe(board,i,col)){
                board[i][col]='Q';
                solve(board,col+1,matrix);
                board[i][col]='.';
            }
        }
    }
    boolean isSafe(char[][] board,int row,int col){
        int n = board.length;
        for(int i=col; i>=0; i--){
            if(board[row][i]=='Q')return false;
        }    
        int i=row; int j=col;
        while(i>=0 && j>=0 && i<n && j<n){
            if(board[i][j]=='Q')return false;
            i--; j--;
        }
        i=row; j=col;
        while(i>=0 && j>=0 && i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++; j--;
        }
        return true;
    }
}
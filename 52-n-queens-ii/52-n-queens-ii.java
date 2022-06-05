class Solution {
    private int counter = 0;
    public int totalNQueens(int N) {
        for(int i=0; i<N; i++) {
            char[][] board = new char[N][N];
            board[i][0] = 'Q';
            solve(board, N, 1);
        }
        return counter;
    }
    private boolean isSafe(char[][] board, int N, int row, int col) {
        for(int i=0; i<N; i++) {
            if(board[i][col]!=0) return false;
            if(board[row][i]!=0) return false;
        }
    
        int step = 1;
        step = 1;
        while(row-step>=0 && col-step>=0) {
            if(board[row-step][col-step]!=0) return false;
            ++step;
        }
        step = 1;
        while(row+step<N && col-step>=0) {
            if(board[row+step][col-step]!=0) return false;
            ++step;
        }
        return true;
    }
    private boolean solve(char[][] board, int N, int col) {
        if(col==N) {
            ++counter; 
            return false;
        }
        for(int i=0; i<N; i++) {
            if(isSafe(board, N, i, col)) {
                board[i][col] = 'Q';
                if(solve(board, N, col+1)) return true;
                else {
                    board[i][col] = 0;
                }
            }
        }
        return false;
    }
}
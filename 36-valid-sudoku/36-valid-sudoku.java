class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++){
            boolean arr1[] = new boolean[9];
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if(c!='.'){
                    if(arr1[c-'1']==false)arr1[c-'1']=true;
                    else return false;
                }
            }
        }
        for(int i=0; i<9; i++){
            boolean arr1[] = new boolean[9];
            for(int j=0; j<9; j++){
                char c = board[j][i];
                if(c!='.'){
                    if(arr1[c-'1']==false)arr1[c-'1']=true;
                    else return false;
                }
            }
        }
        for(int i=0; i<9; i=i+3){
            boolean arr1[] = new boolean[9];
            for(int j=i; j<i+3; j++){
                for(int k=0; k<3; k++){
                    char c = board[j][k];
                    if(c!='.'){
                        if(arr1[c-'1']==false)arr1[c-'1']=true;
                        else return false;
                    }
                }
            }
            boolean arr2[] = new boolean[9];
            for(int j=i; j<i+3; j++){
                for(int k=3; k<6; k++){
                    char c = board[j][k];
                    if(c!='.'){
                        if(arr2[c-'1']==false)arr2[c-'1']=true;
                        else return false;
                    }
                }
            }
            boolean arr3[] = new boolean[9];
            for(int j=i; j<i+3; j++){
                for(int k=6; k<9; k++){
                    char c = board[j][k];
                    if(c!='.'){
                        if(arr3[c-'1']==false)arr3[c-'1']=true;
                        else return false;
                    }
                }
            }
        }
        return true;
    }
}
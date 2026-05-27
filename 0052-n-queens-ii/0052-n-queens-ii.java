class Solution {
     int count=0;
    public int totalNQueens(int n) {
        int row=n;
        int column=n;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
       nqueen(board,0); 
       return count;
    }
    public void nqueen(char[][] board,int row){
        int n=board.length;
        if(row==n){
          count++;
          return;
        }
for(int j=0;j<n;j++){
    if(isSafe(board,row,j)){
        board[row][j]='Q';
        nqueen(board,row+1);
        board[row][j]='.';
            }
}
    }
public static boolean isSafe(char[][] board,int row,int col){
    int n=board.length;
    for(int i=0;i<n;i++){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    for(int j=0;j<n;j++){
        if(board[row][j]=='Q'){
            return false;
        }
    }
    int p=row;
    int q=col;
    while(p>=0 &&q<n){
        if(board[p][q]=='Q'){
            return false;
        }
        p--;
        q++;
    }
    p=row;
    q=col;
    while(p>=0 && q>=0){
        if(board[p][q]=='Q'){
            return false;
        }
        p--;
        q--;
    }
    return true;
}
    }
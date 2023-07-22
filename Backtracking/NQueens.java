public class NQueens {

    public static boolean isSafe(char board[][],int row,int col){
        //for vertical up
        for(int i=row-1;i>=0;i--){
        if(board[i][col] == 'Q' ){
            return false;
        }
        }
        // for diag leftup
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
         // for diag right up
         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
         }
         return true;
    }
    public static void nqueen(char board[][],int row){
     
               //base case
               if(row == board.length){
                printarray(board);
                return;
               }

            for(int j=0;j<board.length;j++){
                if(isSafe(board, row, j))
         {
                    
                    board[row][j] = 'Q';
                    nqueen(board, row+1); // function call
                    board[row][j] = '.';  //backtracking step
                }
            }
    }
    public static void printarray(char board[][]){
        System.out.println("<-----NQueen----->");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = '.';
            }
        }
        nqueen(board,0);
    }
}

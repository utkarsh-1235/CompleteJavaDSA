public class reviseNqueen{
    static int count = 0;
public static boolean isSafe(char board[][],int row,int col){
    // for vertical
      for(int i = row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
      }
      // for left diagonal
      for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
      }
      // for right diagonal
      for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
    public static boolean NQueen(char board[][], int row){
              
        //base case
        if(row==board.length){
            //printArray(board);
            count++;
            return true;
        }
        //recursion    
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j))
       {
                
                board[row][j] = 'Q';
                if(NQueen(board, row+1)){
                    return true;
                }
                board[row][j] = '.';
            }
        }
      return false;
    }
    public static void printArray(char board[][]){
        System.out.println("<------->");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char [n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                
                board[i][j] = '.';
            }
        }
        if(NQueen(board, 0)){
            System.out.println("Solution is possible");
            printArray(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
     System.out.println("Number of ways to solve NQueen problem"+" "+count) ;  
    }
}
